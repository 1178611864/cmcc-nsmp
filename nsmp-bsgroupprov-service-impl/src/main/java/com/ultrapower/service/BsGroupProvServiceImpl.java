package com.ultrapower.service;

import com.ultrapower.dao.*;
import com.ultrapower.pojo.*;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BsGroupProvServiceImpl implements BsGroupProvService {

    @Autowired
    AmBsGroupMapper bsGroupMapper;

    @Autowired
    AmBsGroupProvMapper bsGroupProvMapper;

    @Autowired
    AmBsProvMapper bsProvMapper;

    @Autowired
    BdmProvMapper bdmProvMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    AmAssetMapper assetMapper;

    @Autowired
    AmAssetTypeMapper assetTypeMapper;

    public List<BsGroupVO> initBsGroupTree() {
        List<BsGroupVO> bsGroupVOS = bsGroupMapper.initBsGroupTree();
        return bsGroupVOS;
    }

    public Map<String, Object> findTableDataByNodeId(String nodeId) {
        Map<String,Object> map = new HashMap<String, Object>();

        //1.当前节点基本信息(节点树的右侧)
        AmBsGroup amBsGroup = bsGroupMapper.selectByPrimaryKey(nodeId);
        map.put("amBsGroup",amBsGroup);

        //2.省份业务系统相关表格数据
        List<ProvDTO> provDTOS = selectProvByGroupId(nodeId);
        map.put("provDTOS",provDTOS);

        return map;
    }

    public List<ProvDTO> selectProvByGroupId(String groupId) {
        List<ProvDTO> provDTOS = bsGroupProvMapper.selectProvByGroupId(groupId);
        return provDTOS;
    }

    public int deleteProvGroupMapping(String groupBsId, String provBsId) {

        AmBsGroupProvExample example = new AmBsGroupProvExample();
        AmBsGroupProvExample.Criteria criteria = example.createCriteria();
        criteria.andPkBsGroupEqualTo(groupBsId);
        criteria.andPkBsProvEqualTo(provBsId);
        //  delete from xxx where pkbsgroup = xx pkbsprov = xx;
        int i = bsGroupProvMapper.deleteByExample(example);
        return i;
    }

    public List<BdmProv> selectProvDate() {

        List<BdmProv> bdmProvs = bdmProvMapper.selectByExample(null);

        return bdmProvs;
    }


    public List<AmBsProv> findBsProvByProvCode(String provCode,String groupId) {

        AmBsProvExample example = new AmBsProvExample();
        AmBsProvExample.Criteria criteria = example.createCriteria();

        //条件1、省份code
        criteria.andProvCodeEqualTo(provCode);

        //条件2、数据是未删除状态
        Short s = 1 ;//1.已删除
        criteria.andIsDeletedNotEqualTo(s);

        //条件3、数据是未绑定状态
        //根据当前选中的集团节点，查看，已经绑定了那些省份--》id
        List<String> provIds = findBoundProvIds(groupId);
        if(provIds != null && provIds.size()>0){
            criteria.andPkBsProvNotIn(provIds);
        }

        List<AmBsProv> amBsProvs = bsProvMapper.selectByExample(example);

        return amBsProvs;
    }

    public Map<String, Object> saveGroupProvMapping(String groupId, String bsProvIds,String token) {
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            String[] split = bsProvIds.split(",");
            for (String bsProvId : split){
                AmBsGroupProv bsGroupProv = new AmBsGroupProv();

                bsGroupProv.setPkBsGroupProv(PkUtils.getPrimaryKey());
                bsGroupProv.setPkBsGroup(groupId);
                bsGroupProv.setPkBsProv(bsProvId);
                Short s = 1;
                bsGroupProv.setMatchType(s);
                bsGroupProv.setPkCreator(PkUtils.getUserIdByToken(token,redisTemplate));
                bsGroupProv.setCreateTime(new Date());

                bsGroupProvMapper.insert(bsGroupProv);
            }
            map.put("code",1);
        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 根据指定集团id查询已经绑定了哪些省份系统id
     * @param groupId
     */
    public List<String> findBoundProvIds(String groupId){
        AmBsGroupProvExample example = new AmBsGroupProvExample();
        AmBsGroupProvExample.Criteria criteria = example.createCriteria();
        criteria.andPkBsGroupEqualTo(groupId);

        List<AmBsGroupProv> amBsGroupProvs = bsGroupProvMapper.selectByExample(example);

        List<String> provIds = new ArrayList<String>();

        for (AmBsGroupProv bsGroupProv : amBsGroupProvs){
            provIds.add(bsGroupProv.getPkBsProv());
        }
        return provIds;
    }

    public Map<String, Object> bsGroupProvMappingByProvRegex(String provRegex) {


        //provRegex  == 省份编码  PROV_CODE
        AmBsProvExample example = new AmBsProvExample();
        AmBsProvExample.Criteria criteria = example.createCriteria();


        //排除已经被绑定过的省份业务系统
        //1.查询哪些省份业务系统被绑定了
        List<AmBsGroupProv> amBsGroupProvs = bsGroupProvMapper.selectByExample(null);
        List<String> provIds = bsGroupListToStringList(amBsGroupProvs);

        criteria.andProvCodeLike("%"+provRegex+"%");
        if(provIds!=null && provIds.size()>0){
            criteria.andPkBsProvNotIn(provIds);
        }

        List<AmBsProv> amBsProvs = bsProvMapper.selectByExample(example);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",amBsProvs);

        return map;
    }

    List<String> bsGroupListToStringList(List<AmBsGroupProv> amBsGroupProvs){
        List<String> list = new ArrayList<String>();
        for(AmBsGroupProv bsGroupProv : amBsGroupProvs){
            list.add(bsGroupProv.getPkBsProv());
        }
        return list;
    }

    public Map<String, Object> bsGroupAdd(AddGroupDTO groupDTO, String token) {
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            AmBsGroup amBsGroup = new AmBsGroup();

            amBsGroup.setBsName(groupDTO.getBsName());
            amBsGroup.setBsCode(groupDTO.getBsCode());
            amBsGroup.setDisplaySeq(groupDTO.getDisplaySeq());
            amBsGroup.setBsDesc(groupDTO.getBsDesc());
            amBsGroup.setMappingRegex(groupDTO.getMappingRegex());
            amBsGroup.setPkBsParent(groupDTO.getPkBsParent());

            //当前集团业务系统的主键
            String pkBsGroup = PkUtils.getPrimaryKey();
            amBsGroup.setPkBsGroup(pkBsGroup);
            Short s = 1; //手动录入
            amBsGroup.setBsSrc(s);
            Short d = 0;//未删除
            amBsGroup.setIsDeleted(d);
            amBsGroup.setPkCreator(PkUtils.getUserIdByToken(token,redisTemplate));
            amBsGroup.setCreateTime(new Date());
            amBsGroup.setPkMender(PkUtils.getUserIdByToken(token,redisTemplate));
            amBsGroup.setMendTimeLast(new Date());

            int insert = bsGroupMapper.insert(amBsGroup);

            if(insert>0){
                //向集团业务系统->省份业务系统关联表中，添加数据
                //pkBsGroup
                //省份id
                saveMapping(groupDTO,pkBsGroup,token);
            }
            map.put("code",1);
        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }
        return map;
    }

    public Map<String, Object> deleteBsGroupByGroupId(String pkBsGroup) {
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            //根据id删除集团业务系统
            int i = bsGroupMapper.deleteByPrimaryKey(pkBsGroup);

            //删除该集团业务系统映射的省份业务系统（删除关联表）
            AmBsGroupProvExample example = new AmBsGroupProvExample();
            AmBsGroupProvExample.Criteria criteria = example.createCriteria();
            criteria.andPkBsGroupEqualTo(pkBsGroup);
            bsGroupProvMapper.deleteByExample(example);

            map.put("code",1);
        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }
        return map;

    }

    /**
     * 点击【管辖资产加载3块数据：省份select，类型select，table】
     * @param
     * @return
     */
    public Map<String, Object> initMgAssetQuery(GroupMgAssetQueryVO queryVO) {

        //1.省份的下拉框
        List<BdmProv> provs = bdmProvMapper.selectByExample(null);

        //2.资产类型下拉框
        List<AmAssetType> assetTypes = assetTypeMapper.selectByExample(null);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("provs",provs);
        map.put("assetTypes",assetTypes);
        List<BsGroupMgAsset> bsGroupMgAssets = selectBsGroupMgAsset(queryVO);
        map.put("bsGroupMgAssets",bsGroupMgAssets);//查询表格数据

        return map;
    }

    public List<BsGroupMgAsset> selectBsGroupMgAsset(GroupMgAssetQueryVO queryVO) {
        List<BsGroupMgAsset> bsGroupMgAssets = bsGroupProvMapper.selectBsGroupMgAsset(queryVO);
        return bsGroupMgAssets;
    }

    public Map<String, Object> saveGroupProvRemapping(AddGroupDTO groupDTO, String token) {

        Map<String,Object> map = new HashMap<String, Object>();

        try {
            //1.在关联表中删除 指定集团id的映射关系
            AmBsGroupProvExample example = new AmBsGroupProvExample();
            AmBsGroupProvExample.Criteria criteria = example.createCriteria();
            criteria.andPkBsGroupEqualTo(groupDTO.getPkBsGroup());
            int m = bsGroupProvMapper.deleteByExample(example);

            //2.更新集团业务系统表中指定id那条中的 MAPPING_REGEX
            AmBsGroup bsGroup = bsGroupMapper.selectByPrimaryKey(groupDTO.getPkBsGroup());
            bsGroup.setMappingRegex(groupDTO.getMappingRegex());
            int n = bsGroupMapper.updateByPrimaryKey(bsGroup);

            //3.向关联表中重新插入数据
            saveMapping(groupDTO,groupDTO.getPkBsGroup(),token);

            map.put("code","1");

        } catch (Exception e) {
            map.put("code",0);
            e.printStackTrace();
        }

        return map;    }

    public Map<String,Object> initBsProvTree() {
        List<BsProvVO> bsProvVOS = bsProvMapper.initBsProvTree();
        List<Map<String,Object>> tree = new ArrayList<Map<String,Object>>();
        for(int i = 0; i<bsProvVOS.size(); i++){
            Map<String,Object> first = new HashMap<String, Object>();
            first.put("id",(i+1));
            first.put("pId",0);
            first.put("name",bsProvVOS.get(i).getBsName());
            first.put("pkBsProv",bsProvVOS.get(i).getPkBsProv());


            tree.add(first);
            List<BsProvVO> second = bsProvVOS.get(i).getSecond();
            for(int j =0 ;second!=null&&second.size()>0&& j<second.size(); j ++){

                Map<String,Object> second1 = new HashMap<String, Object>();
                second1.put("id",100+(j+1));
                second1.put("pId",(i+1));
                second1.put("name",second.get(j).getBsName());
                second1.put("pkBsProv",second.get(j).getPkBsProv());

                tree.add(second1);
            }
        }
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("tree",tree);
        return map;
    }

    public Map<String, Object> selectBsProvByProvId(String provId) {
        AmBsProv amBsProv = bsProvMapper.selectByPrimaryKey(provId);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("amBsProv",amBsProv);
        return map;
    }

    public void saveMapping(AddGroupDTO groupDTO,String pkBsGroup,String token){
        String[] provIds = groupDTO.getBsProvIds().split(",");
        for (String pkBsProv : provIds){
            AmBsGroupProv bsGroupProv = new AmBsGroupProv();

            bsGroupProv.setPkBsGroupProv(PkUtils.getPrimaryKey());
            bsGroupProv.setPkBsGroup(pkBsGroup);
            bsGroupProv.setPkBsProv(pkBsProv);
            //0-自动映射
            Short m = 0;
            bsGroupProv.setMatchType(m);
            bsGroupProv.setPkCreator(PkUtils.getUserIdByToken(token,redisTemplate));
            bsGroupProv.setCreateTime(new Date());
            int insert1 = bsGroupProvMapper.insert(bsGroupProv);
        }
    }

}

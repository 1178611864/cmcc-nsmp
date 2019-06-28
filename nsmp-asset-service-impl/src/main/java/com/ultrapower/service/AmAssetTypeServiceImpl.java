package com.ultrapower.service;

import com.ultrapower.dao.AmAssetPropMapper;
import com.ultrapower.dao.AmAssetTypeMapper;
import com.ultrapower.dao.AmAssetTypePropMapper;
import com.ultrapower.dao.AmUserMapper;
import com.ultrapower.pojo.*;
import com.ultrapower.utils.DateTimeUtils;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AmAssetTypeServiceImpl implements AmAssetTypeService {

    @Autowired
    AmAssetTypeMapper assetTypeMapper;

    @Autowired
    AmUserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    AmAssetPropMapper assetPropMapper;

    @Autowired
    AmAssetTypePropMapper assetTypePropMapper;

    /*public List<AmAssetType> findAmAssetTypeList() {
        //条件1：IS_DELETED=0  and IS_VIEW=1
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        Short IS_DELETED = 0;
        Short IS_VIEW = 1;
        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);

        List<AmAssetType> amAssetTypes = assetTypeMapper.selectByExample(amAssetTypeExample);

        for(AmAssetType type: amAssetTypes){
            String pkCreator = type.getPkCreator();//创建人
            String pkMender = type.getPkMender();//最后修改人
            //根据id查姓名
            String createName = userMapper.selectByPrimaryKey(pkCreator).getUserAccount();
            String menderName = userMapper.selectByPrimaryKey(pkMender).getUserAccount();
            //把id替换成姓名
            type.setPkCreator(createName);
            type.setPkMender(menderName);
        }

        return amAssetTypes;
    }*/

    public List<AmAssetType> findAmAssetTypeList() {
        List<AmAssetType> amAssetTypes = assetTypeMapper.selectTypeUserPkToAccount();
        return amAssetTypes;
    }

    public AmAssetType findAmAssetTypeByName(String name) {

        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andTypeNameEqualTo(name);

        List<AmAssetType> amAssetTypes = assetTypeMapper.selectByExample(amAssetTypeExample);
        //由于数据库中，分类名称不允许重复，所有amAssetTypes集合的大小为1

        return amAssetTypes.get(0);
    }

    public List<Nodes> assetTypesNodes() {

        /*{ id:1, pId:0, name:"操作系统", open:true},
        { id:100, pId:1, name:"Centos"},
        { id:101, pId:1, name:"Ubuntu"},
        { id:2, pId:0, name:"WEB应用"},
        { id:200, pId:2, name:"app1"},
        { id:3, pId:0, name:"虚拟机"},
        { id:300, pId:3, name:"暂无子分类"}*/

        /*所有的一级分类节点id从1开始，对应的二级分类节点从10开始*/

        List<AssetTypeDTO> assetTypeDTOS = assetTypeMapper.assetTypes();

        List<Nodes> nodes = new ArrayList<Nodes>();

        for(int i = 0 ; i < assetTypeDTOS.size() ; i++){
            AssetTypeDTO assetTypeDTO = assetTypeDTOS.get(i);

            List<AssetTypeDTO> secondTypes = assetTypeDTO.getSecondTypes();

            Nodes one = new Nodes();//一级节点
            one.setId((i+1)+"");
            one.setName(assetTypeDTO.getName());
            one.setpId(0+"");

            for(int j = 0  ; j < secondTypes.size() ; j++){
                AssetTypeDTO assetTypeDTO1 = secondTypes.get(j);
                Nodes two = new Nodes();
                two.setId((100*(i+1)+j)+"");
                two.setpId((i+1)+"");
                two.setName(assetTypeDTO1.getName());

                nodes.add(two);
            }

            if(secondTypes.size()==0){
                Nodes two = new Nodes();
                two.setId(100*(i+1)+"");
                two.setpId((i+1)+"");
                two.setName("暂无子分类");

                nodes.add(two);
            }

            nodes.add(one);
        }

        return nodes;
    }

    public List<AmAssetType> findAmAssetTypeListByCondition(AssetTypeQueryVO queryVO) {

        //{beginTime='2019-06-03', endTime='2019-06-05', keywords='操作系统'}

        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();

        criteria.andCreateTimeBetween(DateTimeUtils.stringToDate(queryVO.getBeginTime()),DateTimeUtils.stringToDate(queryVO.getEndTime()));
        criteria.andTypeNameLike("%"+queryVO.getKeywords()+"%");

        List<AmAssetType> amAssetTypes = assetTypeMapper.selectByExample(amAssetTypeExample);

        return amAssetTypes;
    }

    public List<AmAssetType> findAllFirstAssetType() {
        //条件1：IS_DELETED=0  and IS_VIEW=1
        //条件2：必须一级分类节点
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();

        Short IS_DELETED = 0;
        Short IS_VIEW =  1;

        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);
        criteria.andPkTypeParentIsNull();

        List<AmAssetType> amAssetTypes = assetTypeMapper.selectByExample(amAssetTypeExample);

        return amAssetTypes;
    }

    public int addAssetType(AmAssetType assetType,String pkCreator) {

        //校验当前类型名称是否已经存在
        String typeName = assetType.getTypeName();//表单中的名称
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andTypeNameEqualTo(typeName);
        List<AmAssetType> list = assetTypeMapper.selectByExample(amAssetTypeExample);
        if(list!=null&&list.size()>0){
            return -1;
        }

        //typeName  typeCode  pkTypeParent  typeDesc
        assetType.setPkAssetType(PkUtils.getPrimaryKey());
        assetType.setPkTypeParent(assetType.getPkTypeParent().equals("root")?null:assetType.getPkTypeParent());
        Short is_view = 1 ;
        Short is_delete = 0 ;
        assetType.setIsView(is_view);
        assetType.setIsDeleted(is_delete);

        //创建人(当前登录人) cookie中又没有当前登录人的id？
        assetType.setPkCreator(pkCreator);
        assetType.setPkMender(pkCreator);

        //创建时间
        Date date = new Date();
        assetType.setCreateTime(date);
        assetType.setMendTimeLast(date);

        int insert = assetTypeMapper.insert(assetType);
        return insert;
    }

    public AmAssetType findAmAssetTypeById(String id) {
        AmAssetType type = assetTypeMapper.selectByPrimaryKey(id);
        return type;
    }

    public void saveAssetType(AmAssetType amAssetType, String token) {
        String pkAssetType = amAssetType.getPkAssetType();//隐藏域中的id
        //先根据id查询
        AmAssetType db_amAssetType = findAmAssetTypeById(pkAssetType);

        //表中中的修改之后的数据
        String typeName = amAssetType.getTypeName();
        String typeCode = amAssetType.getTypeCode();
        String typeDesc = amAssetType.getTypeDesc();
        String pkTypeParent = amAssetType.getPkTypeParent();//如果选择“根节点” pkTypeParent==root  ， 数据库(NULL)

        db_amAssetType.setTypeName(typeName);
        db_amAssetType.setTypeCode(typeCode);
        db_amAssetType.setTypeDesc(typeDesc);
        db_amAssetType.setPkTypeParent(pkTypeParent.equals("root")?null:pkTypeParent);

        //最后修改人 cookie  redis  中有最后修改人的id
        //最好是根据token（token）去redis中把当前用户id取出来
        String currentUid = redisTemplate.boundHashOps("session").get("token_"+token)+"";
        db_amAssetType.setPkMender(currentUid);
        db_amAssetType.setMendTimeLast(new Date());

        int i = assetTypeMapper.updateByPrimaryKey(db_amAssetType);

    }

    public Map<String, Object> deleteAssetTypeById(String id) {


        Map<String, Object> result = new HashMap<String, Object>();
        //删除语句？IS_DELETED NULL是否删除,0-未删除、1-已删除
        //先根据id查询

        AmAssetType amAssetType = findAmAssetTypeById(id);
        Short delete = 1;
        amAssetType.setIsDeleted(delete);

        int i = assetTypeMapper.updateByPrimaryKey(amAssetType);

        if(i>0){
            result.put("code","1");//删除成功
        }else{
            result.put("code","0");//删除失败
        }

        return result;
    }

    public Map<String, Object> assetTypeBatchDel(String ids) {
        // 11,22,333
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            String[] typeIds = ids.split(",");
            for (String id : typeIds){
                deleteAssetTypeById(id);
            }
            result.put("code","1");
        } catch (Exception e) {
            result.put("code","0");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 资产类型树页面，选中资产类型，加载两部分数据（详情，属性列表）
     * @param name
     * @return
     */
    public Map<String, Object> findAmAssetTypeAndPropListByName(String name) {

        //1.查询分类详情
        AmAssetType amAssetType = findAmAssetTypeByName(name);

        //最后修改人的id--》名称
        String pkMender = amAssetType.getPkMender();
        String userAccount = userMapper.selectByPrimaryKey(pkMender).getUserAccount();
        amAssetType.setPkMender(userAccount);


        //2.属性列表
        List<AmAssetProp> propList = assetPropMapper.findPropListByAssetTypeId(amAssetType.getPkAssetType());


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("amAssetType",amAssetType);
        map.put("propList",propList);
        return map;
    }

    public Map<String, Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp) {

        Map<String, Object> map = new HashMap<String, Object>();

        /*条件*/
        AmAssetTypePropExample example = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = example.createCriteria();
        criteria.andPkAssetPropEqualTo(assetTypeProp.getPkAssetProp());
        criteria.andPkAssetTypeEqualTo(assetTypeProp.getPkAssetType());

        /*查询数据库*/
        AmAssetTypeProp amAssetTypeProp = assetTypePropMapper.selectByExample(example).get(0);

        /*更新字段*/
        amAssetTypeProp.setIsView(assetTypeProp.getIsView());
        amAssetTypeProp.setNeedValue(assetTypeProp.getNeedValue());
        amAssetTypeProp.setCollectType(assetTypeProp.getCollectType().replace(",",""));

        int i = assetTypePropMapper.updateByExample(amAssetTypeProp, example);
        if(i>0){
            map.put("code",1);
            return map;
        }
        map.put("code",0);
        return map;
    }
}

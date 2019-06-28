package com.ultrapower.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ultrapower.dao.AmAssetPropMapper;
import com.ultrapower.dao.AmAssetTypeMapper;
import com.ultrapower.dao.AmAssetTypePropMapper;
import com.ultrapower.dao.AmPropClassMapper;
import com.ultrapower.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AssetPropServiceImpl implements AssetPropService {

    @Autowired
    AmAssetPropMapper assetPropMapper;

    @Autowired
    AmPropClassMapper propClassMapper;

    @Autowired
    AmAssetTypeMapper assetTypeMapper;

    @Autowired
    AmAssetTypePropMapper assetTypePropMapper;

    @Autowired
    AmAssetTypeService assetTypeService;


    /**
     * 查询数据库
     * @return
     */
    public List<AmAssetProp> findAllAmAssetProp() {

        AmAssetPropExample amAssetPropExample = new AmAssetPropExample();
        AmAssetPropExample.Criteria criteria = amAssetPropExample.createCriteria();

        Short IS_VIEW = 1 ;
        Short IS_DELETED = 0 ;

        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);

        List<AmAssetProp> amAssetProps = assetPropMapper.selectByExample(amAssetPropExample);
        return amAssetProps;
    }

    public Map<String, Object> assetPropPageInit(int pageNum,int pageSize) {

        Map<String,Object> result = new HashMap<String, Object>();


        //（1）设置分页
        PageHelper.startPage(pageNum,pageSize);

        // （2）  1.表格中的属性数据（查数据库）
        List<AmAssetProp> allAmAssetProp = findAllAmAssetProp();

        //（3）创建PageInfo
        PageInfo<AmAssetProp> pageInfo = new PageInfo<AmAssetProp>(allAmAssetProp);

        for(AmAssetProp prop : pageInfo.getList()){
            String dataType = prop.getDataType();
            //N（umber）为数字类型，D（ate）为日期，S（tring）为字符，E（num）为枚举，L（ist）为列表类型，P（assword）为密码
            prop.setDataType(dataTypeToString(dataType));

            //处理属性分类 id --> 名称
            String pkPropClass = prop.getPkPropClass();
            String propClassName = propClassMapper.selectByPrimaryKey(pkPropClass).getPropClassName();
            prop.setPkPropClass(propClassName);
            prop.setCollectType(collectTypeToString(prop.getCollectType()));
        }

        //2.属性分类
        List<AmPropClass> amPropClasses = propClassMapper.selectByExample(null);

        //3、业务分类       1=通用属性、2=硬件属性、3=软件属性、4=登录属性、5=自定义属性
        Map<String, String> type1 = new HashMap<String,String>();
        type1.put("bsTypeId","1");
        type1.put("bsTypeName","通用属性");

        Map<String, String> type2 = new HashMap<String,String>();
        type2.put("bsTypeId","2");
        type2.put("bsTypeName","硬件属性");

        Map<String, String> type3 = new HashMap<String,String>();
        type3.put("bsTypeId","3");
        type3.put("bsTypeName","软件属性");

        Map<String, String> type4 = new HashMap<String,String>();
        type4.put("bsTypeId","4");
        type4.put("bsTypeName","登录属性");

        Map<String, String> type5 = new HashMap<String,String>();
        type5.put("bsTypeId","5");
        type5.put("bsTypeName","自定义属性");   // === pojo(bsTypeId  bsTypeName )
        /*type5.put("1","自定义属性");*/

        List<Map<String, String>> bsType = Arrays.asList(type1, type2, type3, type4, type5);


        //4、采集方式   3位二进制位，分别代表：人工录入、登录采集、远程扫描。0为不支持、1-支持
        List<String> collectType = new ArrayList<String>();
        collectType.add("人工录入");
        collectType.add("登录采集");
        collectType.add("远程扫描");


        //result.put("allAmAssetProp",allAmAssetProp);
        result.put("pageInfo",pageInfo);
        result.put("amPropClasses",amPropClasses);
        result.put("bsType",bsType);
        result.put("collectType",collectType);


        return result;
    }

    /**
     * 根据类型名称查询类型主键
     * @param nodeName
     * @return
     */
    public String getTypeIdByTypeName(String nodeName){
        //根据类型名称查询id
        AmAssetTypeExample typeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = typeExample.createCriteria();
        criteria.andTypeNameEqualTo(nodeName);

        String pkAssetType = assetTypeMapper.selectByExample(typeExample).get(0).getPkAssetType();
        return pkAssetType;
    }

    public List<AmAssetProp> findPropByTypeNameNotBound(String nodeName) {

        String pkAssetType = getTypeIdByTypeName(nodeName);

        //////////////////////////

        //根据指定的类型id去关联表中查询该类型绑定了那些属性id
        AmAssetTypePropExample amAssetTypePropExample = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria1 = amAssetTypePropExample.createCriteria();
        criteria1.andPkAssetTypeEqualTo(pkAssetType);

        List<AmAssetTypeProp> amAssetTypeProps = assetTypePropMapper.selectByExample(amAssetTypePropExample);
        List<String> propIds = new ArrayList<String>();
        for (AmAssetTypeProp amAssetTypeProp : amAssetTypeProps){
            String pkAssetProp = amAssetTypeProp.getPkAssetProp();//属性id
            propIds.add(pkAssetProp);
        }

        //  查询属性表，排除propIds
        AmAssetPropExample propExample = new AmAssetPropExample();
        AmAssetPropExample.Criteria propExampleCriteria = propExample.createCriteria();
        if(propIds.size()<=0){

        }else{
            propExampleCriteria.andPkAssetPropNotIn(propIds);
        }

        List<AmAssetProp> propList = assetPropMapper.selectByExample(propExample);

        /*SELECT * FROM `am_asset_prop` d WHERE d.`PK_ASSET_PROP` NOT IN
        (SELECT b.`PK_ASSET_PROP` FROM
        `am_asset_type` a ,`am_asset_prop` b ,`am_asset_type_prop` c
        WHERE c.`PK_ASSET_PROP` = b.`PK_ASSET_PROP`
        AND c.`PK_ASSET_TYPE` = a.`PK_ASSET_TYPE`
        AND a.`TYPE_NAME` = '数据库')*/

        return propList;
    }

    /*
    * 返回值：map
    * */
    public Map<String, Object> boundAssetTypeProps(String propIds, String typeName) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            //1.根据类型名称获取id
            String pkAssetType = getTypeIdByTypeName(typeName);

            //2.属性的id列表
            String[] pIds = propIds.split(",");

            for (String pid:pIds){
                AmAssetTypeProp assetTypeProp = new AmAssetTypeProp();
                assetTypeProp.setPkAssetType(pkAssetType);
                assetTypeProp.setPkAssetProp(pid);
                //其他字段自行补全
                assetTypePropMapper.insert(assetTypeProp);
            }
        } catch (Exception e) {
            map.put("code",0);//失败
            e.printStackTrace();
            return map;
        }
        map.put("code",1);//成功
        //完成绑定之后，查询该类型所绑定的所有的属性


        return map;
    }

    public List<AmAssetTypeProp> boundSuccessWritePropTabel(String typeName) {

        //1.根据类型名称获取id
        String pkAssetType = getTypeIdByTypeName(typeName);

        return null;
    }




    //N（umber）为数字类型，D（ate）为日期，S（tring）为字符，E（num）为枚举，L（ist）为列表类型，P（assword）为密码
    String dataTypeToString(String dataType){
        Map<String,String> map = new HashMap<String, String>();
        map.put("N","数字类型");
        map.put("D","日期类型");
        map.put("S","字符");
        map.put("E","枚举");
        map.put("L","列表类型");
        map.put("P","密码");
        return map.get(dataType);
    }


    //1=通用属性、2=硬件属性、3=软件属性、4=登录属性、5=自定义属性
    String bsTypeToString(Short bsType){
        //switch ()
        //if
        if(bsType==1){
            return "通用属性";
        }else if(bsType == 2){
            return "硬件属性";
        }else if(bsType == 3){
            return "软件属性";
        }else if(bsType == 4){
            return "登录属性";
        }else{
            return "自定义属性";
        }
    }

    String collectTypeToString(String collectType){
        //001
        //人工录入、登录采集、远程扫描
        String[] split = collectType.split("");
        String one = split[0].equals("0")?"":"人工录入  ";
        String two = split[1].equals("0")?"":"登录采集  ";
        String three = split[2].equals("0")?"":"远程扫描  ";

        return one+two+three;
    }

    public List<AmAssetProp> AssetPropController_searchPropByName(String propName, String typeName) {

        HashMap<String,String> hashMap = new HashMap<String,String>();
        //typeName  类型名称

        String pkAssetType = getTypeIdByTypeName(typeName);

        hashMap.put("PK_ASSET_TYPE",pkAssetType);
        hashMap.put("PROP_NAME","%"+propName+"%");
        List<AmAssetProp> propListByAssetTypeIdAndLikePropName = assetPropMapper.findPropListByAssetTypeIdAndLikePropName(hashMap);

        return propListByAssetTypeIdAndLikePropName;
    }


    /**
     * 解绑操作
     * @param pkAssetProp
     * @param typeName
     * @return
     */
    public Map<String, Object> unbundle(String pkAssetProp, String typeName) {


        //typeName 类型的名称
        String typeIdByTypeName = getTypeIdByTypeName(typeName);

        AmAssetTypePropExample amAssetTypePropExample = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = amAssetTypePropExample.createCriteria();
        criteria.andPkAssetTypeEqualTo(typeIdByTypeName);
        criteria.andPkAssetPropEqualTo(pkAssetProp);

        int i = assetTypePropMapper.deleteByExample(amAssetTypePropExample);

        Map<String, Object> map = new HashMap<String, Object>();
        if(i>0){
            map.put("code",1);
        }else{
            map.put("code",0);
        }

        return map;
    }

    public Map<String, Object> configShow(String current_node_click, String current_prop_config) {

        Map<String, Object> map = new HashMap<String, Object>();

        //current_node_click 类型的名称
        String typeid = getTypeIdByTypeName(current_node_click);
        String propid = current_prop_config;

        //查询
        AmAssetTypePropExample example = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = example.createCriteria();

        criteria.andPkAssetTypeEqualTo(typeid);
        criteria.andPkAssetPropEqualTo(propid);

        //1、关联表的数据
        AmAssetTypeProp amAssetTypeProp = assetTypePropMapper.selectByExample(example).get(0);
        map.put("amAssetTypeProp",amAssetTypeProp);

        //2、属性名称、属性编码(根据属性id去属性表查询)
        AmAssetProp prop = assetPropMapper.selectByPrimaryKey(propid);
        map.put("prop",prop);

        return map;
    }

}

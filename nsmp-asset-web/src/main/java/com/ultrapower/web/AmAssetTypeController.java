package com.ultrapower.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AssetTypeQueryVO;
import com.ultrapower.pojo.Nodes;
import com.ultrapower.service.AmAssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AmAssetTypeController {

    @Autowired
    AmAssetTypeService amAssetTypeService;


    /**
     * 查询类型列表（未删除 and 可显示）
     * @return
     */
    /*@GetMapping("/amAssetTypes")
    public List<AmAssetType> findAmAssetTypeList(){
        List<AmAssetType> amAssetTypeList = amAssetTypeService.findAmAssetTypeList();
        return amAssetTypeList;
    }*/
    @GetMapping("/amAssetTypes")
    public PageInfo<AmAssetType> findAmAssetTypeList(@RequestParam(defaultValue = "1") int pageNum,
                                                     @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNum, pageSize);

        List<AmAssetType> amAssetTypeList = amAssetTypeService.findAmAssetTypeList();

        PageInfo<AmAssetType> pageInfo = new PageInfo(amAssetTypeList);
        //PageInfo<AmAssetType>

        return pageInfo;
    }


    @GetMapping("/assetTypes")
    List<Nodes> assetTypesNodes(){
        List<Nodes> nodes = amAssetTypeService.assetTypesNodes();
        return nodes;
    }


    /**
     * 根据分类名称查询分类详情
     * @param name
     * @return
     */
    @GetMapping("/findAmAssetTypeByName")
    AmAssetType findAmAssetTypeByName(@RequestParam String name){
        AmAssetType amAssetTypeByName = amAssetTypeService.findAmAssetTypeByName(name);
        return amAssetTypeByName;
    }

    /**
     * 根据分类名称,查询分类详情+该分类所有的属性信息
     * @param name
     */
    @GetMapping("/findAmAssetTypeAndPropListByName")
    Map<String,Object> findAmAssetTypeAndPropListByName(@RequestParam String name){
        Map<String, Object> amAssetTypeAndPropListByName = amAssetTypeService.findAmAssetTypeAndPropListByName(name);
        return amAssetTypeAndPropListByName;
    }


    @PostMapping("/findAmAssetTypeListByCondition")
    public List<AmAssetType> findAmAssetTypeListByCondition(AssetTypeQueryVO queryVO){

        List<AmAssetType> amAssetTypeListByCondition = amAssetTypeService.findAmAssetTypeListByCondition(queryVO);

        return amAssetTypeListByCondition;
    }

    @GetMapping("/findAllFirstAssetType")
    List<AmAssetType> findAllFirstAssetType(){
        List<AmAssetType> allFirstAssetType = amAssetTypeService.findAllFirstAssetType();
        return allFirstAssetType;
    }


    @PostMapping("/addAssetType")
    public int addAssetType(AmAssetType assetType,@CookieValue("pkNsmpUser") String pkCreator) {
        int i = amAssetTypeService.addAssetType(assetType, pkCreator);
        return i;
    }

    /**
     * 根据指定的id查询类型信息
     * @param id
     * @return
     */
    @GetMapping("/findAmAssetTypeById")
    Map<String, Object> findAmAssetTypeById(@RequestParam String id){
        AmAssetType amAssetType = amAssetTypeService.findAmAssetTypeById(id);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("pkAssetType",amAssetType.getPkAssetType());
        resultMap.put("typeName",amAssetType.getTypeName());
        resultMap.put("typeCode",amAssetType.getTypeCode());
        resultMap.put("typeDesc",amAssetType.getTypeDesc());
        resultMap.put("pkTypeParent",amAssetType.getPkTypeParent());
        return resultMap;
    }

    /**
     * 初始化编辑类型页面的数据
     * @param id
     * @return
     */
    @GetMapping("/findAssetTypeDataInitEditPage")
    List<Object> findAssetTypeDataInitEditPage(@RequestParam String id){
        //1、下拉框数据
        List<AmAssetType> allFirstAssetType = amAssetTypeService.findAllFirstAssetType();

        //2、回显的数据
        AmAssetType amAssetType = amAssetTypeService.findAmAssetTypeById(id);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("pkAssetType",amAssetType.getPkAssetType());
        resultMap.put("typeName",amAssetType.getTypeName());
        resultMap.put("typeCode",amAssetType.getTypeCode());
        resultMap.put("typeDesc",amAssetType.getTypeDesc());
        resultMap.put("pkTypeParent",amAssetType.getPkTypeParent()==null?"root":amAssetType.getPkTypeParent());

        List<Object> data = new ArrayList<Object>();
        data.add(allFirstAssetType);
        data.add(resultMap);

        return data;
    }

    @PostMapping("/saveAssetType")
    public void saveAssetType(AmAssetType amAssetType,@CookieValue("token") String token){
        amAssetTypeService.saveAssetType(amAssetType,token);
    }

    @PostMapping("/deleteAssetTypeById")
    public Map<String,Object> deleteAssetTypeById(@RequestParam String id){
        return amAssetTypeService.deleteAssetTypeById(id);
    }


    @GetMapping("/assetTypeBatchDel")
    public Map<String,Object> assetTypeBatchDel(String ids){
        return amAssetTypeService.assetTypeBatchDel(ids);
    }

}

package com.ultrapower.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetTypeProp;
import com.ultrapower.service.AmAssetTypeService;
import com.ultrapower.service.AssetPropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AssetPropController {

    @Autowired
    AssetPropService assetPropService;

    @Autowired
    AmAssetTypeService assetTypeService;

    @Autowired
    RedisTemplate redisTemplate;


    /**
     *
     * @param pageNum  当前第几页（从1开始）
     * @param pageSize 每页显示的数量
     * @return
     */
    @GetMapping("/assetPropPageInit")
    Map<String, Object> assetPropPageInit(@RequestParam(defaultValue = "1") int pageNum,
                                          @RequestParam(defaultValue = "3") int pageSize) {

        //  proplist(hash的名字)  proplist_1_3  map
        String key = "proplist_"+pageNum+"_"+pageSize;


        Boolean bol = redisTemplate.boundHashOps("proplist").hasKey(key);
        if(bol){
            Map<String, Object> map = (Map<String, Object>)redisTemplate.boundHashOps("proplist").get(key);
            System.out.println("proplist   ----  redis");
            return map;
        }

        Map<String, Object> map = assetPropService.assetPropPageInit(pageNum,pageSize);
        redisTemplate.boundHashOps("proplist").put(key,map);

        System.out.println("proplist   ----  mysql");
        return map;
    }

    @GetMapping("/initBoundPropPage")
    List<AmAssetProp> initBoundPropPage(@RequestParam String nodeName) {
        //根据 类型名称 查询没有被绑定的属性
        List<AmAssetProp> propByTypeNameNotBound = assetPropService.findPropByTypeNameNotBound(nodeName);
        return propByTypeNameNotBound;
    }

    /*完成绑定的处理器接口*/
    @GetMapping("/boundAssetTypeProps")
    Map<String, Object> boundAssetTypeProps(@RequestParam String propIds, @RequestParam String typeName) {
        //现在的map只有一个code
        Map<String, Object> map = assetPropService.boundAssetTypeProps(propIds, typeName);

        //绑定成功后，重新查询
        List<AmAssetProp> propList = (List<AmAssetProp>) assetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propList");
        map.put("propList", propList);

        return map;
    }

    @GetMapping("/boundSuccessProp")
    List<AmAssetProp> boundSuccessWritePropTabel(@RequestParam String typeName) {
        Map<String, Object> map = assetTypeService.findAmAssetTypeAndPropListByName(typeName);
        List<AmAssetProp> propList = (List<AmAssetProp>) map.get("propList");
        return propList;
    }

    @GetMapping("/AssetPropController_searchPropByName")
    List<AmAssetProp> AssetPropController_searchPropByName(@RequestParam String propName, @RequestParam String typeName) {

        List<AmAssetProp> propList = assetPropService.AssetPropController_searchPropByName(propName, typeName);

        return propList;
    }

    @GetMapping("/AssetPropController_unbundle")
    Map<String, Object> unbundle(@RequestParam String pkAssetProp, @RequestParam String typeName) {
        Map<String, Object> map = assetPropService.unbundle(pkAssetProp, typeName);

        //解绑成功后，重新查询（下面的查询操作不能写在unbundle方法中，因为unbundle未提交，数据中没有更新的数据）
        List<AmAssetProp> propList = (List<AmAssetProp>) assetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propList");
        map.put("propList", propList);

        return map;
    }

    /**
     * 配置属性，页面数据加载回显
     * @return
     */
    @GetMapping("/AssetPropController_configShow")
    Map<String,Object> configShow(@CookieValue("current_node_click") String current_node_click,
                                  @CookieValue("current_prop_config") String current_prop_config){

        /*
        * map有两部分数据：
        * */
        Map<String, Object> map = assetPropService.configShow(current_node_click, current_prop_config);

        return map;
    }

    @PostMapping("AssetPropController_updateSaveConfigProp")
    Map<String,Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp,@CookieValue("current_node_click") String typeName){
        Map<String, Object> map = assetTypeService.updateSaveConfigProp(assetTypeProp);
        if(Integer.parseInt(map.get("code")+"") == 1){
            //查询查询数据
            List<AmAssetProp> propList = (List<AmAssetProp>) assetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propList");
            map.put("propList", propList);
        }
        return map;
    }

}

package com.ultrapower.service;

import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetTypeProp;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface AssetPropService {

    /**
     * 查询所有资产类型属性
     * @return
     */
    List<AmAssetProp> findAllAmAssetProp();

    /**
     * 加载 资产属性列表页面 初始化数据
     * @return
     */
    Map<String,Object> assetPropPageInit(int pageNum,int pageSize);

    //根据 类型名称 查询没有被绑定的属性
    List<AmAssetProp> findPropByTypeNameNotBound(String nodeName);

    /**
     * 为指定类型绑定属性
     * @param propIds
     * @return
     */
    Map<String,Object> boundAssetTypeProps( String propIds,String typeName);


    /**
     * 根据选中类型结点的名称，查询所绑定的属性
     * @param typeName
     * @return
     */
    List<AmAssetTypeProp> boundSuccessWritePropTabel( String typeName);


    /**
     * 模糊查询指定类型绑定的属性
     * @param propName
     * @param typeName
     * @return
     */
    List<AmAssetProp> AssetPropController_searchPropByName( String propName,String typeName);


    /**
     * 为指定的类型，解绑属性
     * @param pkAssetProp
     * @param typeName
     * @return
     */
    Map<String,Object> unbundle(String pkAssetProp,String typeName);


    /**
     * 配置属性前，在弹出页面上，回显数据
     * @param current_node_click
     * @param current_prop_config
     * @return
     */
    Map<String,Object> configShow(String current_node_click,String current_prop_config);


}

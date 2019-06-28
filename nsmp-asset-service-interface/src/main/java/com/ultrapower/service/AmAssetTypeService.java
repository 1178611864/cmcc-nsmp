package com.ultrapower.service;

import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AmAssetTypeProp;
import com.ultrapower.pojo.AssetTypeQueryVO;
import com.ultrapower.pojo.Nodes;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface AmAssetTypeService {

    /**
     * 查询所有类型信息
     * @return
     */
    public List<AmAssetType> findAmAssetTypeList();


    /**
     * 根据分类名称查询分类详情
     * @param name
     * @return
     */
    AmAssetType findAmAssetTypeByName(String name);


    /**
     * 查询分类树节点信息
     * @return
     */
    List<Nodes> assetTypesNodes();


    /**
     * 条件查询
     * @param queryVO
     * @return
     */
    List<AmAssetType> findAmAssetTypeListByCondition(AssetTypeQueryVO queryVO);


    /**
     * 查询所有一级节点
     * @return
     */
    List<AmAssetType> findAllFirstAssetType();

    /**
     * 添加资产类型
     * @param assetType
     * @return
     */
    int addAssetType(AmAssetType assetType,String pkCreator);


    /**
     * 根据指定的id查询类型信息
     * @param id
     * @return
     */
    AmAssetType findAmAssetTypeById(String id);


    /**
     * 修改保存分类信息
     * @param amAssetType
     * @param token
     */
    public void saveAssetType(AmAssetType amAssetType,@CookieValue("token") String token);


    /**
     * 根据指定的id删除
     * @param id
     * @return
     */
    Map<String,Object> deleteAssetTypeById(@RequestParam String id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public Map<String,Object> assetTypeBatchDel(String ids);

    /**
     * 根据分类名称,查询分类详情+该分类所有的属性信息
     * name: 类别的名称
     * @return
     */
    Map<String,Object> findAmAssetTypeAndPropListByName(String name);

    /**
     * 配置资产类型属性 后 保存
     * @param assetTypeProp
     * @return
     */
    Map<String,Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp);

}

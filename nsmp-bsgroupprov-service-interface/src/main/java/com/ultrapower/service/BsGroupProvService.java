package com.ultrapower.service;

import com.ultrapower.pojo.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface BsGroupProvService {

    /*集团业务系统树*/
    List<BsGroupVO> initBsGroupTree();


    /**
     * 点击集团业务系统节点时请求的数据
     * @param nodeId
     * @return
     */
    Map<String,Object> findTableDataByNodeId(String nodeId);


    /**
     * 根据指定集团业务系统ID，查询省份业务系统等信息
     * @param groupId
     * @return
     */
    List<ProvDTO> selectProvByGroupId(String groupId);

    /**
     * 删除省份业务系统映射
     * @param groupBsId
     * @param provBsId
     * @return
     */
    int deleteProvGroupMapping( String groupBsId, String provBsId);


    /**
     * 返回省份的集合
     * @return
     */
    List<BdmProv> selectProvDate();

    /**
     *
     * @param provCode
     * @return
     */
    List<AmBsProv> findBsProvByProvCode(String provCode,String groupId);

    /**
     * 保存 集团-省份 映射关系
     * @param groupId
     * @param bsProvIds
     * @return
     */
    Map<String,Object> saveGroupProvMapping( String groupId,String bsProvIds,String token);

    Map<String, Object> bsGroupProvMappingByProvRegex(String provRegex);

    Map<String, Object> bsGroupAdd(AddGroupDTO groupDTO, String token);

    /**
     * 根据GroupId删除节点
     * @param pkBsGroup
     * @return
     */
    Map<String,Object> deleteBsGroupByGroupId(@RequestParam String pkBsGroup);

    public Map<String, Object> initMgAssetQuery(GroupMgAssetQueryVO queryVO);

    public List<BsGroupMgAsset> selectBsGroupMgAsset(GroupMgAssetQueryVO queryVO);

    public Map<String, Object> saveGroupProvRemapping(AddGroupDTO groupDTO,String token);

    /*集团业务系统树*/
    Map<String,Object> initBsProvTree();

    /**
     * 根据provId查询am_bs_prov表
     * @param provId
     * @return
     */
    Map<String,Object> selectBsProvByProvId(String provId);

}

package com.ultrapower.web;

import com.ultrapower.pojo.*;
import com.ultrapower.service.BsGroupProvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/BsGroupProvController")
public class BsGroupProvController {

    @Autowired
    BsGroupProvService bsGroupProvService;


    /*
    *
    * var zNodes =[
	{ id:1, pId:0, name:"移动集团",aaa:0, open:true},
		{ id:101, pId:1, name:"核心网系统",aaa:'aaaaa'},
			{ id:1011, pId:101, name:"通信网电路域省际长途网",aaa:6},
			{ id:1012, pId:101, name:"移动通信网电路域省内长途网",aaa:6},
			{ id:1013, pId:101, name:"移动通信网分组域国际部分",aaa:3},
    	{ id:102, pId:1, name:"业务网系统",nodepk:1,aaa:123123,bb:"adafd"},
    	{ id:103, pId:1, name:"数据网系统",nodepk:2},
    	{ id:104, pId:1, name:"IP承载网系统",nodepk:3},
    { id:2, pId:0, name:"测试",aaa:0, open:true},
];

    * */


    @GetMapping("/bsGroupTree")
    Map<String,Object> bsGroupTree(){
        List<BsGroupVO> bsGroupVOS = bsGroupProvService.initBsGroupTree();

        List<Map<String,Object>> tree = new ArrayList<>();

        /*对bsGroupVOS循环，每循环一次，得到一个一级节点*/
        for (int i = 0 ; i < bsGroupVOS.size() ; i++){
            Map<String,Object> firstNode = new HashMap<>();
            firstNode.put("id",(i+1));//id从1开始
            firstNode.put("pId",0);
            firstNode.put("name",bsGroupVOS.get(i).getBsName());
            firstNode.put("nodepk",bsGroupVOS.get(i).getPkBsGroup());
            if(i==0){
                firstNode.put("open",true);//只有当前是第一个一级节点，才让他open
            }
            tree.add(firstNode);

            //每一个一级节点都有一组二级节点
            List<BsGroupVO> second = bsGroupVOS.get(i).getSecond();
            for(int j = 0 ; second!=null && second.size()>0 && j < second.size() ;j++){
                BsGroupVO bsGroupVO = second.get(j);//二级节点

                Map<String,Object> secondNode = new HashMap<>();
                secondNode.put("id",100+(j+1));//id从101开始
                secondNode.put("pId",(i+1));
                secondNode.put("name",bsGroupVO.getBsName());
                secondNode.put("nodepk",bsGroupVO.getPkBsGroup());

                tree.add(secondNode);


                //每一个二级节点有一组三级节点
                List<BsGroupVO> third = bsGroupVO.getThird();
                for (int k = 0 ; third!=null && third.size()>0 && k < third.size() ; k++){
                    BsGroupVO three = third.get(k);//三级节点

                    Map<String,Object> threeNode = new HashMap<>();
                    threeNode.put("id",1011+k);//id从1011开始
                    threeNode.put("pId",100+(j+1));
                    threeNode.put("name",three.getBsName());
                    threeNode.put("nodepk",three.getPkBsGroup());

                    tree.add(threeNode);
                }

            }

        }

        Map<String,Object> result = new HashMap<>();/* 也可以直接在处理器接口方法参数上声明一个map   Map<String,Object> map*/
        result.put("bsGroupTree",tree);

        return result;
    }


    /**
     * 点击集团业务系统节点
     * @param nodeId
     * @return
     */
    @GetMapping("/findTableDataByNodeId")
    Map<String,Object> findTableDataByNodeId(@RequestParam String nodeId){
        Map<String, Object> map = bsGroupProvService.findTableDataByNodeId(nodeId);
        return map;
    }

    @GetMapping("/deleteProvGroupMapping")
    Map<String,Object> deleteProvGroupMapping(@RequestParam String groupBsId,@RequestParam String provBsId){
        Map<String,Object> map = new HashMap<>();
        int i = bsGroupProvService.deleteProvGroupMapping(groupBsId, provBsId);
        if(i>0){
            map.put("code",1);//成功
            return map;
        }
        map.put("code",-1);//失败
        return map;
    }

    @GetMapping("/initProvData")
    Map<String,Object> initProvData(){
        Map<String,Object> map = new HashMap<>();
        List<BdmProv> amBsProvs = bsGroupProvService.selectProvDate();
        map.put("amBsProvs",amBsProvs);

        return map;
    }

    /**
     *
     * @param provCode  选中的省份下拉框的编码
     * @return
     */
    @GetMapping("/findBsProvByProvCode")
    Map<String,Object> findBsProvByProvCode(@RequestParam String provCode,@CookieValue("groupId") String groupId){
        Map<String,Object> map = new HashMap<>();
        List<AmBsProv> bsProvByProvCode = bsGroupProvService.findBsProvByProvCode(provCode,groupId);
        map.put("bsProvByProvCode",bsProvByProvCode);

        return map;
    }

    /**
     * 保存映射关系
     * @param groupId
     * @param bsProvIds
     * @param token
     * @return
     */
    @GetMapping("/saveGroupProvMapping")
    Map<String,Object> saveGroupProvMapping(@RequestParam String groupId,
                                            @RequestParam String bsProvIds,
                                            @CookieValue("token") String token){
        Map<String, Object> map = bsGroupProvService.saveGroupProvMapping(groupId, bsProvIds, token);

        //保存成功之后，重新查询一下该集团映射了那了省份节点
        List<ProvDTO> provDTOS = bsGroupProvService.selectProvByGroupId(groupId);
        map.put("provDTOS",provDTOS);

        return map;
    }

    @GetMapping("/bsGroupProvMappingByProvRegex")
    Map<String,Object> bsGroupProvMappingByProvRegex(@RequestParam String provRegex){
        Map<String, Object> map = bsGroupProvService.bsGroupProvMappingByProvRegex(provRegex);
        return map;
    }


    @PostMapping("/bsGroupAdd")
    Map<String,Object> bsGroupAdd(AddGroupDTO groupDTO, @CookieValue("token") String token){
        Map<String, Object> map = bsGroupProvService.bsGroupAdd(groupDTO, token);
        return map;
    }

    /**
     * 根据GroupId删除节点
     * @param pkBsGroup
     * @return
     */
    @PostMapping("/deleteBsGroupByGroupId")
    Map<String,Object> deleteBsGroupByGroupId(@RequestParam String pkBsGroup){
        Map<String, Object> map = bsGroupProvService.deleteBsGroupByGroupId(pkBsGroup);
        Integer code = (Integer) map.get("code");
        if(code == 1 ){
            Map<String, Object> map1 = bsGroupTree();//删除成功，重新查询业务系统树
            map1.put("code",1);
        }
        return map;
    }

    /**
     * 点击【管辖资产加载3块数据：省份select，类型select，table】
     * @param groupId
     * @return
     */
    @GetMapping("/initMgAssetQuery")
    Map<String,Object> initMgAssetQuery(@CookieValue("groupId") String groupId){
        GroupMgAssetQueryVO queryVO = new GroupMgAssetQueryVO();
        queryVO.setGroupId(groupId);
        Map<String, Object> map = bsGroupProvService.initMgAssetQuery(queryVO);
        return map;
    }


    /**
     * 点击 管辖资产-->查询
     * @param queryVO
     * @return
     */
    @GetMapping("/searchMgAsset")
    Map<String,Object> searchMgAsset(@CookieValue("groupId") String groupId,GroupMgAssetQueryVO queryVO){
        queryVO.setGroupId(groupId);
        List<BsGroupMgAsset> bsGroupMgAssets = bsGroupProvService.selectBsGroupMgAsset(queryVO);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bsGroupMgAssets",bsGroupMgAssets);
        return map;
    }

    /**
     * 重新映射
     * @param groupDTO
     * @param token
     * @param groupId
     * @return
     */
    @GetMapping("/saveGroupProvRemapping")
    Map<String,Object> saveGroupProvRemapping(AddGroupDTO groupDTO,@CookieValue("token") String token,@CookieValue("groupId") String groupId){
        groupDTO.setPkBsGroup(groupId);
        Map<String, Object> map = bsGroupProvService.saveGroupProvRemapping(groupDTO, token);
        return map;//pkBsParent  bsProvIds mappingRegex
    }

    @GetMapping("/initBsProvTree")
    Map<String,Object> initBsProvTree(){
        Map<String, Object> map = bsGroupProvService.initBsProvTree();
        return map;
    }

    /**
     * 根据provId查询am_bs_prov表
     * @param provId
     * @return
     */
    @GetMapping("/selectBsProvByProvId")
    Map<String,Object> selectBsProvByProvId(String provId){
        Map<String, Object> map = bsGroupProvService.selectBsProvByProvId(provId);
        return map;
    }
}

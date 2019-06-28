package com.ultrapower.web;

import com.ultrapower.dao.AmBsGroupMapper;
import com.ultrapower.pojo.BsGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    AmBsGroupMapper bsGroupMapper;

    @GetMapping("/test1")
    public List<BsGroupVO>  test1(){
        List<BsGroupVO> bsGroupVOS = bsGroupMapper.initBsGroupTree();
        return bsGroupVOS;
    }

}

package com.ultrapower.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class line {

    @GetMapping("/tests111")
    public Map<String,Object> tests111(){
        Map<String,Object> map=new HashMap<>();
        List<String> x= Arrays.asList("a","b","c");
        List<String> y= Arrays.asList("100","150","70");
        map.put("x",x);
        map.put("y",y);
        return map;
    }

    @GetMapping("/test2")
    public Map<String,Object> test2(){
         /*[ '操作系统','虚拟机','防火墙']

        [

        {value:510, name: '操作系统'},
        {value:634, name: '虚拟机'},
        {value:735, name: '防火墙'}
                            ]*/
        Map<String,Object> map=new HashMap<>();
        List<String> list=Arrays.asList("操作系统","虚拟机","防火墙");
        Map<String,Object> map1=new HashMap<>();
        map1.put("value","510");
        map1.put("name","操作系统");
        Map<String,Object> map2=new HashMap<>();
        map2.put("name","虚拟机");
        map2.put("value",634);
        Map<String,Object> map3=new HashMap<>();
        map3.put("name","防火墙");
        map3.put("value",735);

        List<Map<String,Object>> series = Arrays.asList(map1,map2,map3);

        map.put("data1",list);
        map.put("data2",series);

        return map;
    }

}

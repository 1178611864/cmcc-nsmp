package com.ultrapower.web;

import java.util.Date;

public class Jobs {

    public void job1() {
        System.out.println("job1:"+new Date(System.currentTimeMillis()));
    }
    //任务2
    public void job2() {
        System.out.println("job2:"+new Date(System.currentTimeMillis()));
    }
}

package com.ultrapower;

import org.junit.Test;

public class B {

    @Test
    public void b(){
        App a1 = App.a();
        App a2 = App.a();
        System.out.println(a1==a2);
    }
}

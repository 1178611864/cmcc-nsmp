package com.ultrapower;

import org.junit.Test;

public class App {
    private App(){}
    public static App s;
    public static App a(){

        if(s==null){
            s=new App();
        }
        return s;
    }


}

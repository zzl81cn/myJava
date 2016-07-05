package com.myjava.generic;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class A1 extends Apple<String> {
    public String getInfo(){
        return "subClass" +  super.getInfo();
    }
}

package com.myjava.generic;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class A2 extends Apple<String> {
    @Override
    public String getInfo() {
        return super.getInfo().toString();
    }
}

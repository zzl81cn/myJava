package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 */
interface Product {
    int getProduceTime();
}
public class Printer implements Output, Product {
    private String [] printData = new String[MAX_CACHE_LINE];
    @Override
    public void out() {

    }

    @Override
    public void getData(String msg) {

    }

    @Override
    public int getProduceTime() {
        return 0;
    }
}

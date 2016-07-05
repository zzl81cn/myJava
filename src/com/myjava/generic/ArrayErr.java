package com.myjava.generic;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class ArrayErr {
    public static void main(String[] args) {
        Integer [] ia = new Integer[5];
        Number [] na = ia;
//        na[0] = 0.5;
        na[0] = 5;
    }
}

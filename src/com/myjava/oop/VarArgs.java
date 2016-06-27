package com.myjava.oop;

/**
 * Created by zhouzilong on 2016/6/27.
 */
public class VarArgs {
    public static void test(int a, String... books){
        for(String tmp:books){
            System.out.println(tmp);
        }
        System.out.println(a);
    }
    public static void main(String args[]){
        test(5, "123", "四五六");
    }
}
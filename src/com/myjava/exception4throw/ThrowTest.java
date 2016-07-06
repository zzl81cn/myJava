package com.myjava.exception4throw;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class ThrowTest {
    public static void main(String[] args) {
        try{
            throwChecked(-3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        throwRuntime(3);
    }
    public static void throwChecked(int a) throws Exception {
        if(a>0){
            throw new Exception("a values large than zero, err");
        }
    }
    public static void throwRuntime(int a){
        if(a>0){
            throw new RuntimeException("a values large than zero, err.");
        }
    }
}

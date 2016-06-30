package com.myjava.oop4inherit;

/**
 * Created by zhouzilong on 2016/6/29.
 */
public class Ostrich extends Bird {
    @Override
    public void fly(){
        System.out.println("bbb");
    }
    public static void main(String args[]){
        Ostrich os = new Ostrich();
        os.fly();
    }
}

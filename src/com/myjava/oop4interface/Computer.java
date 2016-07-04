package com.myjava.oop4interface;

import com.myjava.oop4interface.Output;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class Computer {
    // Computer类只与Output接口耦合，Computer类不负责创建Output对象，系统提供一个Output工厂来负责生成Output对象。
    private Output out;
    public Computer(Output out){
        this.out = out;
    }
    public void keyIn(String msg){
        out.getData(msg);
    }
    public void print(){
        out.out();
    }
}

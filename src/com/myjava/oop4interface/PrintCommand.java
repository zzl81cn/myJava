package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class PrintCommand implements Command {
    public void process(int [] target){
        for(int tmp: target){
            System.out.println("迭代输出数组的元素： " + tmp);
        }
    }
}

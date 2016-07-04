package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class ProcessArray {
    public void process(int [] target, Command cmd){
        cmd.process(target);
    }
}

package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class BetterPrinter implements Output {
    private String [] printData = new String[MAX_CACHE_LINE * 2];
    private int dataNum = 0;
    @Override
    public void out() {
        while(dataNum > 0){
            System.out.println("HighSpeed printer is working: " + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if(dataNum >= MAX_CACHE_LINE *2){
            System.out.println("Queue is full");
        } else {
            printData[dataNum++] = msg;
        }
    }
}

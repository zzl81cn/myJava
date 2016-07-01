package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 */
interface Product {
    int getProduceTime();
}
public class Printer implements Output, Product {
    private String [] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;
    @Override
    public void out() {
        while(dataNum > 0){
            System.out.println("打印机打印：" + printData[0]);
            // 把作业队列整体前移一位，并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {

    }

    @Override
    public int getProduceTime() {
        return 0;
    }
}

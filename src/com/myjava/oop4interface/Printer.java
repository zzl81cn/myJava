package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 */

public class Printer implements Output, Product {
    private String [] printData = new String[MAX_CACHE_LINE];
    // 用以记录当前需打印的作业数
    private int dataNum = 0;

    @Override
    public void out() {
        while(dataNum > 0){
            System.out.println("Printer is working：" + printData[0]);
            // 把作业队列整体前移一位，并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if(dataNum >= MAX_CACHE_LINE){
            System.out.println("输出队列已满，数据添加失败！");
        } else {
            printData[dataNum++] = msg;
        }
    }

    @Override
    public int getProduceTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("SSH");
        o.getData("Spring");
        o.out();
        o.getData("Crazy Java");
        o.getData("Crazy Android");
        o.out();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
        // 所有接口类型的引用变量都可以赋值给Object类型的变量
        Object obj = p;
    }
}

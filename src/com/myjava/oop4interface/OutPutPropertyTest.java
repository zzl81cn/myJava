package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 * #about 简单工厂模式
 * 接口里的Field默认是public static final修饰的，即便另一个类不在同一个包下也可以通过接口来访问接口里的常量Field。
 */
public class OutPutPropertyTest {
    public static void main(String[] args) {
        System.out.println(Output.MAX_CACHE_LINE);
    }
}

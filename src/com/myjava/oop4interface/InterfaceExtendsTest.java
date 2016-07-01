package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 * #lesson 6.6.3
 */
interface interfaceA {
    int PRO_A = 5;
    void testA();
}
interface interfaceB {
    int PRO_B = 8;
    void testB();
}
interface interfaceC extends interfaceA, interfaceB {
    int PRO_C = 10;
    void testC();
}
public class InterfaceExtendsTest {
    public static void main(String[] args) {
        System.out.println(interfaceC.PRO_A);
        System.out.println(interfaceC.PRO_B);
        System.out.println(interfaceC.PRO_C);
    }
}

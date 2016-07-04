package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 * #lesson 6.6.3
 * 接口支持多继承，即一个接口可以有多个直接父接口。和类继承类似，子接口扩展某个父接口，将会获得父接口里定义的所有抽象方法、常量Field。
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

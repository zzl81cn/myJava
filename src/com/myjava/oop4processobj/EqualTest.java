package com.myjava.oop4processobj;

/**
 * Created by zhouzilong on 2016/7/1.
 */
public class EqualTest {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == fl));
        char ch = 'A';
        System.out.println("65和A是否相等？" + (it == ch));
        int ch2a = (int)ch;
        System.out.println("ch2a's value is: " + ch2a);
        String st1 = new String("hello");
        String st2 = new String("hello");
        // Will be console "false"
        System.out.println("st1 和 st2是否相等？" + (st1 == st2));
        System.out.println("st1是否equals st2" + st1.equals(st2));
//        System.out.println("hello" == new EqualTest());
    }
}

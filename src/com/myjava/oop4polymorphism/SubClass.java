package com.myjava.oop4polymorphism;

/**
 * Created by zhouzilong on 2016/6/30.
 */
class BaseClass {
    public int book = 6;
    public void base() {
        System.out.println("Parent class normal method.");
    }
    public void test() {
        System.out.println("The parent class covered way.");
    }
}

public class SubClass extends BaseClass {
    public String book = "Another book";

    @Override
    public void test() {
//        super.test();
        System.out.println("Subclass override supperclass method.");
    }
    public void sub() {
        System.out.println("Sub class normal method.");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
    }
}

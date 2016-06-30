package com.myjava.oop4polymorphism;

/**
 * Created by zhouzilong on 2016/6/30.
 * about polymorphism
 * 因为子类其实是一种特殊的父类，因此java允许把一个子类对象直接赋给一个父类引用变量，无须任何类型转换，或者被称为向上转型（upcasting），向上转型由系统自动完成。
 * 当把一个子类对象直接赋给父类引用变量时，比如下面例子中引用变量编译时是父类类型，而运行时则是子类类型，当运行时调用该引用变量的方法时，其方法行为总是表现出子类方法的行为特征，而不是父类方法的行为特征，这就可能出现，相同类型的变量、调用同一个方法时呈现出多种不同的行为特征，这就是多态。
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
        System.out.println("Subclass override superclass method.");
    }
//    @Override
//    public void base() {
//        System.out.println("xxx");
//    }
    public void sub() {
        System.out.println("Sub class normal method.");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        System.out.println("*********************");
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        sc.sub();
        System.out.println("*********************");
        BaseClass polymorphicBc = new SubClass();
        System.out.println("polymorphicBc's book: " +polymorphicBc.book);
        polymorphicBc.base();
        polymorphicBc.test();
    }
}

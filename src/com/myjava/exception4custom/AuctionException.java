package com.myjava.exception4custom;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class AuctionException extends Exception {
    // 一个无参数的构造器
    public AuctionException(){};
    // 带字符串参数的构造器，这个字符串作为该异常对象的描述信息（也就是异常对象的个体Message()方法的返回值）
    public AuctionException(String message) {
        super(message);
    }
}

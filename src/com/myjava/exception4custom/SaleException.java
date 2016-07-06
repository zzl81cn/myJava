package com.myjava.exception4custom;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class SaleException extends Exception {
    public SaleException(){}
    public SaleException(String msg){
        super(msg);
    }
    public SaleException(Throwable t){
        super(t);
    }
}

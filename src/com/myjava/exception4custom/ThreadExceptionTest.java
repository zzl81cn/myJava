package com.myjava.exception4custom;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class ThreadExceptionTest implements Runnable {
    @Override
    public void run() {
        firstMethod();
    }
    public void firstMethod(){
        secondMethod();
    }
    public void secondMethod(){
        int a = 5;
        int b = 0;
        int c = a/b;
    }

    public static void main(String[] args) {
        new Thread(new ThreadExceptionTest()).start();
    }
}

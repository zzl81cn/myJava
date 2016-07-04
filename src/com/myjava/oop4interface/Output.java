package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/1.
 * 定义一个接口，里面包含一个常量field:MAX_CACHE_LINE，除此之外还定义了两个方法，一个取得数据，一个输出。
 */
public interface Output {
    int MAX_CACHE_LINE = 50;
    void out();
    void getData(String msg);
}

package com.myjava.exception4throws;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class ThrowsTest2 {
    public static void main(String[] args) throws Exception {
        test();
    }
    public static void test() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}

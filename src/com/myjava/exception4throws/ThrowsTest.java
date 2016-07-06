package com.myjava.exception4throws;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class ThrowsTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}

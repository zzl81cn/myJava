package com.myjava.Exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("a.txt");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            System.out.println("There!");
            return;
            // 下面强制退出虚拟机，后面的finally将不会执行
//            System.exit(1);
        } finally {
            if(fis != null) {
                try{
                    fis.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally块里的资源回收.");
        }
    }
}

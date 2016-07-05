package com.myjava.Exception;

import java.util.Date;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class NullTest {
    public static void main(String[] args) {
        Date d = null;
        try{
            System.out.println(d.after(new Date()));
        } catch (NullPointerException ne){
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("未知异常");
        }
    }
}

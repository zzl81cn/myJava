package com.myjava.collection4set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class SetTest {
    public static void main(String[] args) {
        Set books = new HashSet<String>();
        books.add(new String("Crazy Java"));
        boolean result = books.add(new String("Crazy Java"));
        System.out.println(result + "-->" + books);
    }
}

package com.myjava.collection4list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("SSH"));
        books.add(new String("Crazy Java"));
        books.add(new String("Crazy Android"));
        System.out.println(books);
        System.out.println("--------");
        books.add(1, new String("Crazy AJAX"));
        for(int i = 0;i < books.size();i++){
            System.out.println(books.get(i));
        }
    }
}

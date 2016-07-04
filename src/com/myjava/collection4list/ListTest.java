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
        // Insert into index 2
        books.add(1, new String("Crazy AJAX"));
        for(int i = 0;i < books.size();i++){
            System.out.println(books.get(i));
        }
        System.out.println("--------");
        books.remove(2);
        System.out.println("delete 2nd element: " + books);
        System.out.println(books.indexOf(new String("Crazy AJAX")));
        books.set(1, new String("Crazy Java"));
        System.out.println(books);
        // 到第三个元素（不含）截取成子集合
        System.out.println(books.subList(1, 2));
    }
}

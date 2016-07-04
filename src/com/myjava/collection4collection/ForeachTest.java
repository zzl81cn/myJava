package com.myjava.collection4collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("SSH");
        books.add("Crazy Java");
        boolean result = books.add("Crazy Java");
        System.out.println("add result is: " + result);
        books.add("Crazy Android");
        books.add("Crazy Abc");
        for(Object obj: books){
            String book = (String)obj;
            System.out.println(book);
            if(book.equals("Crazy Java")){
                //...
            }
        }
        System.out.println(books);
    }
}

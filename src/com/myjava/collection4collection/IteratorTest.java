package com.myjava.collection4collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("SSH");
        books.add("Crazy Java");
        books.add("Crazy Android");
        Iterator it = books.iterator();
        while(it.hasNext()){
            String book = (String)it.next();
            if(book.equals("Crazy Java")){
                it.remove();
            }
            book = "test string";
        }
        System.out.println(books);
    }
}

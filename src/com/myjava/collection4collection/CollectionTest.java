package com.myjava.collection4collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("sunwukong");
        c.add("sunwukong");
        c.add(6);
        System.out.println("c's collection4collection element length: " + c.size());
        // delete
        c.remove(6);
        System.out.println("c's collection4collection element length: " + c.size());
        if(c.contains("sunwukong")){
            System.out.println("c is container sunwukong.");
        }
        c.add("SSH");
        System.out.println("c elements: " + c);
        Collection books = new HashSet();
        books.add("SSH");
        books.add("Crazy Java");
        System.out.println("c collection4collection if contaner books: " + c.containsAll(books));
        c.removeAll(books);
        System.out.println("c elements: " + c);
        c.clear();
        System.out.println("c elements: " + c);
        books.retainAll(c);
        System.out.println("books elements: " + books);
    }
}

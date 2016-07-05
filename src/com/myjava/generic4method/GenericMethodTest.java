package com.myjava.generic4method;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class GenericMethodTest {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c){
        for(T o: a){
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        // Object types
        fromArrayToCollection(oa, co);
        String [] sa =new String[100];
        Collection<String> cs = new ArrayList<>();
        // String types
        fromArrayToCollection(sa, cs);
        Integer [] ia = new Integer[100];
        Float [] fa = new Float[100];
        Number [] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();
        // Number types
        fromArrayToCollection(ia, cn);
        // Number types
        fromArrayToCollection(fa, cn);
        // Number types
        fromArrayToCollection(na, cn);
        // Object types
        fromArrayToCollection(na, co);
        // 下面T代表String类型，但na是一个Number数组，因为Number既不是String类型也不是他的子类所以出现编译错误
        // fromArrayToCollection(na, cs);
    }
}

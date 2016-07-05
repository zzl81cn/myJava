package com.myjava.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouzilong on 2016/7/5.
 * #about 泛型
 * 所谓泛型，就是运行在定义类、接口、方法时使用类型形参，这个类型形参将在声明变量、创建对象、调用方法时动态的指定（即传入实际的类型参数，也可称为类型实参）。
 */
public class GenericTest {
    public static void main(String[] args) {
//        List strList = new ArrayList();
        List<String> strList = new ArrayList<String>();
//        List<String> strList = new Arraylist<>();
        strList.add("SSH");
        strList.add("Crazy Java");
        strList.add("Crazy Android");
//        strList.add(1);
        for(int i = 0; i<strList.size();i++){
//            String str = (String)strList.get(i);
            String str = strList.get(i);
            System.out.println(str);
        }
    }
}

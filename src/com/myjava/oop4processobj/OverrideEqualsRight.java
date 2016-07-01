package com.myjava.oop4processobj;

/**
 * Created by zhouzilong on 2016/7/1.
 * #通常而言，正确重写equals方法应该满足下列条件：
 * ## 自反性：对任意x，x.equals(x)一定返回ture；
 * ##
 * ##
 * ##
 * ##
 */
class Person {
    private String name;
    private String idStr;

    public Person(){};
    public Person(String name, String idStr){
        this.name = name;
        this.idStr = idStr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getName() {

        return name;
    }

    public String getIdStr() {
        return idStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Person.class){
            Person personObj =(Person)obj;
            if(this.getIdStr().equals(personObj.getIdStr())){
                return true;
            }
        }
        return false;
    }
}
public class OverrideEqualsRight {
    public static void main(String[] args) {
        Person p1 =new Person("abc", "1234");
        Person p2 =new Person("abc", "1234");
        Person p3 = new Person("abc", "1111");
        System.out.println("p1 && p2 boolean equals " + p1.equals(p2));
        System.out.println("p2 && p3 boolean equals " + p2.equals(p3));
    }
}

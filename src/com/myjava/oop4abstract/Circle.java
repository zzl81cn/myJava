package com.myjava.oop4abstract;

/**
 * Created by zhouzilong on 2016/7/1.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double calPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String getType(){
        return getColor() + "圆形";
    }

/**
 * 此处定义了两个Shape类型的引用变量，他们分别指向Triangle对象和Circle对象。由于在Shape类中定义了callPerimeter()方法和getType()方法，所以程序可以直接调用s1变量和s2变量的callPerimeter()方法和getType()方法，无须强制类型转换为其子类型。
 * 利用抽象类和抽象方法的优势，我们可以更好的发挥多态的优势，使得程序更加灵活。
 * */
    public static void main(String[] args) {
        Shape sa1 = new Triangle("black", 3, 4, 5);
        Shape sa2 = new Circle("Red", 3);
        System.out.println(sa1.getType());
        System.out.println(sa1.calPerimeter());
        System.out.println(sa2.getType());
        System.out.println(sa2.calPerimeter());
    }
}

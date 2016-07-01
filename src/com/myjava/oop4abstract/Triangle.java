package com.myjava.oop4abstract;

/**
 * Created by zhouzilong on 2016/7/1.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c){
        super(color);
        this.setSides(a, b, c);
    }
    public void setSides(double a, double b, double c){
        if(a >= b + c || b >= a + c || c >= a + b){
            System.out.println("err");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calPerimeter(){
        return a + b +c;
    }
    @Override
    public String getType(){
        return "triangle";
    }

    public static void main(String[] args) {
        Triangle tr = new Triangle("red", 3.0, 3.0, 3.0);
        System.out.println(tr.calPerimeter());
//        tr.calPerimeter();
        System.out.println(tr.getType());
//        tr.getType();
    }
}

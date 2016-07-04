package com.myjava.oop4interface;

/**
 * Created by zhouzilong on 2016/7/4.
 */
public class OutputFactory {
    public Output getOutput(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("SSH");
        c.keyIn("Crazy Java");
        c.print();
    }
}

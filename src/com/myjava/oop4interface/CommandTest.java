package com.myjava.oop4interface;
import com.myjava.oop4interface.PrintCommand;
import com.myjava.oop4interface.AddCommand;

/**
 * Created by zhouzilong on 2016/7/4.
 * #about 命令模式
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int [] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        pa.process(target, new AddCommand());
    }
}

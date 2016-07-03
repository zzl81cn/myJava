package com.myjava.ssy;

public class Test1 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.output();
		mc.output2();
		mc.output3();
	}
}

interface MyInterface {
	public void output();
}

interface MyInterface2 {
	public void output2();
}

class MyParent {
	public void output3() {
		// TODO Auto-generated method stub
		System.out.println("output3 ");
	}
}

class MyClass extends MyParent implements MyInterface, MyInterface2 {
	public void output() {
		System.out.println("output");
	}

	@Override
	public void output2() {
		// TODO Auto-generated method stub
		System.out.println("output2");
	}
}
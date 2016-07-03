package com.myjava.ssy4enum;

public class ColorTest {
	public static void main(String[] args) {
		Color myColor = Color.blue;
		System.out.println(myColor);
		for(Color color:Color.values()){
			System.out.println(color);
		}
	}
}

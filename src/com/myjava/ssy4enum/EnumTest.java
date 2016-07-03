package com.myjava.ssy4enum;

public class EnumTest {
	public static void doCpCo(OpConstant opconstant) {
		switch (opconstant) {
		case TURN_LIFT:
			System.out.println("向左转");
			break;
		case TURN_RIGHT:
			System.out.println("向右转");
			break;
		case SHOOT:
			System.out.println("射击");
			break;
		}
	}
	public static void main(String[] args) {
		doCpCo(OpConstant.SHOOT);
	}
}

enum OpConstant {
	TURN_LIFT, TURN_RIGHT, SHOOT;
}
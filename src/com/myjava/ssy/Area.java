package com.myjava.ssy;

public class Area {
	/**
	 * @param args
	 */
	public static int getArea(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = getArea(3, 5);
		System.out.println(area);
		System.out.println(getArea(4, 6));
		getArea(8, 9);
	}
}

package com.myjava.ssy;

public class DoWhileTest {
public static void main(String[] args) {
	//int a = 1;
	int a = 2;//����ż���ĺ�
	int sum = 0;
	do{
		sum += a;
		//++a;
		a += 2;
	}
	while(a <= 100);
	System.out.println(sum);
}

}

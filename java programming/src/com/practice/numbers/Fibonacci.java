package com.practice.numbers;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter total fin terms");
		int num=s.nextInt();
		fib(num);

	}
	public static void fib(int num)
	{
		int num1=0,num2=1,num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int n=3;n<=num;n++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}
}

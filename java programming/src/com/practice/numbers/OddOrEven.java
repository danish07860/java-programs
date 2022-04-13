package com.practice.numbers;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(isEven(num))
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num+" is odd");
		}
		
	}
	public static boolean isEven(int num)
	{
		if(num%10!=0)
		{
			return false;
		}
		return true;
	}

}

package com.practice.numbers;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		if(isBuzz(num))
		{
			System.out.println(num+" is buzz");
		}
		else
		{
			System.out.println(num+" is not buzz");
		}
		

	}
	public static boolean isBuzz(int num)
	{
		if(num%10==7 || num%7==0)
		{
			return true;
		}
		return false;
	}

}

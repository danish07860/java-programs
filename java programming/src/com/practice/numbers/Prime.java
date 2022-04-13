package com.practice.numbers;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" is not prime");
		}

	}
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return true;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

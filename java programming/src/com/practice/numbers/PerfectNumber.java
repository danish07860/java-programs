package com.practice.numbers;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(isPerfect(num))
		{
			System.out.println(num+" is perfect number");
		}
		else
		{
			System.out.println(num+" is not perfect number");
		}
	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			return true;
		}
		return false;
	}

}

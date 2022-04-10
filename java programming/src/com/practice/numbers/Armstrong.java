package com.practice.numbers;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		if(isArmstrong(num))
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}

	}

	public static boolean isArmstrong(int num) {
		int res=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			res+=rem*rem*rem;
			num/=10;
		}
		if(res==temp)
		{
			return true;
		}
		return false;
	}
}

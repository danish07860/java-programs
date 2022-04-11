package com.practice.numbers;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(isAutomorphic(num))
		{
			System.out.println(num+" is automorphic");
		}
		else
		{
			System.out.println(num+" is not automorphic");
		}
		
	}
	public static boolean isAutomorphic(int num) {
		int sq=num*num,count=0,end=0,temp=num;
		
		while(num>0)
		{
			num/=10;
			count++;
		}
		end=(int) (sq%Math.pow(10, count));
		if(end==temp)
		{
			return true;
		}
		return false;
		
	}
}

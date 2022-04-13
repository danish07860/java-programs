package com.practice.numbers;

import java.util.Scanner;

public class DigitsInNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int tDigit=totalDigits(num);
		System.out.println("total digits in "+num+" is "+tDigit);
		
	}
	public static int totalDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}

}

package com.practice.numbers;

public class PerfectNoBetweenRange {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i);
			}
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

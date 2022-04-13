package com.practice.numbers;

public class SumOfPrimeBwRange {

	public static void main(String[] args) {
		int s=primeSum();
		System.out.println(s);

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
	public static int primeSum()
	{
		int sum=0;
		for(int i=50;i<=100;i++)
		{
			if(isPrime(i))
				sum+=i;
		}
		return sum;
	}

}

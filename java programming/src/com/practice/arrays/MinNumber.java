package com.practice.arrays;

public class MinNumber {
	public static void main(String[] args) {
		int a[]= {2,1,3,4,5};
		System.out.println(min(a));
		
	}
	static int min(int a[])
	{
		if(a==null)
		 {
			 return -1;
		 }
		int m=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<m)
			{
				m=a[i];
			}
		}
		return m;
	}

}

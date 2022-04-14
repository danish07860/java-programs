package com.practice.arrays;

public class MaxNumber {
	public static void main(String[] args) {
		int a[]= {1,5,7,4,8};
		System.out.println(max(a));
		System.out.println(maxInRange(a, 1, 3));
	}

	 static int max(int[] a) {
		 if(a==null)
		 {
			 return -1;
		 }
		int m=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>m)
			{
				m=a[i];
			}
		}
		return m;
	}
	 static int maxInRange(int[] a,int start,int end) {
			int m=Integer.MIN_VALUE;
			for(int i=start;i<end;i++)
			{
				if(a[i]>m)
				{
					m=a[i];
				}
			}
			return m;
		}

}

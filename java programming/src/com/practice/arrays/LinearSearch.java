package com.practice.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int target=1;
		System.out.println(linear(a, target));
		

	}
	//return index if found
	static int linear(int[] a,int target)
	{
		if(a.length==0)
		{
			return -1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
				return i;
		}
		return -1;
	}

}

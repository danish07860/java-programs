package com.practice.arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] a= {1,3,5,9,6};
		swap(a,2,3);
		System.out.println(Arrays.toString(a));
	}

	static void swap(int[] a, int index1, int index2) {
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
	}

}

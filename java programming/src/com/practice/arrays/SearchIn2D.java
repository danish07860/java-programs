package com.practice.arrays;

import java.util.Arrays;

public class SearchIn2D {

	public static void main(String[] args) {
		int[][] a= {
				{0,9,8},{1,2,3},{5,6}
		};
		int target=5;
		int[] ans=search(a, target);
		System.out.println(Arrays.toString(ans));

	}

	static int[] search(int[][] a, int target) {
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(a[row][col]==target)
					return new int[]{row,col};
			}
		}
		return new int[]{-1,-1};
	}

}

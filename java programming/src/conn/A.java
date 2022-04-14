package conn;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		/*
		 * for(int i=0;i<=a.length-1;i++) { System.out.println(a[i]); }
		 */
		System.out.println(Arrays.toString(a));
	}

}

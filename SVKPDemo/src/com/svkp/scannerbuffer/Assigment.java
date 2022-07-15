package com.svkp.scannerbuffer;

import java.util.Scanner;

public class Assigment {

	public static void main(String[] args) {
		int i,j,n;
		System.out.println("input number of n :");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			System.out.println(i);
			System.out.println("");
		}
	}

}

package com.svkp.scannerbuffer;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		Scanner obj = new Scanner(System.in);
		int x;
		x = obj .nextInt();
		System.out.println("The entered number is : " + x);

	}

}

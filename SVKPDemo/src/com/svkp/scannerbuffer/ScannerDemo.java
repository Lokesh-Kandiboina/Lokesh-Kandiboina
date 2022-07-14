package com.svkp.scannerbuffer;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		try (Scanner in = new Scanner(System.in)) 
		{
			int input = in.nextInt();
		
		if (input > 0)
		{
			System.out.println("Number is positive");
		}
		else if (input < 0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("number is Zero");
		}

	}

  }

}
package com.svkp.scannerbuffer;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
			try (Scanner in = new Scanner(System.in)) {
				System.out.println("Input the first number: ");
				double a = in.nextDouble();
				System.out.println("Input the second number: ");
				double b = in.nextDouble();
				System.out.println("Input the third number: ");
				double c = in.nextDouble();
				System.out.println("The smallest value is " + smallest(a,b,c)+"\n");
			}
		}

		private static double smallest(double a, double b, double c) {
			return Math.min(Math.min(a,b), c);
		}

	}

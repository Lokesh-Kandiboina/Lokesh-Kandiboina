package com.svkp.scannerbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double i;
		System.out.println("Enter the value of a number: ");
		i = Double.parseDouble(in.readLine());
		if(i<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}

}

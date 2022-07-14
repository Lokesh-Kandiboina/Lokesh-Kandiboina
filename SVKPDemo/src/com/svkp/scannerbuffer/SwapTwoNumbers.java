package com.svkp.scannerbuffer;


public class SwapTwoNumbers {

	public static void main(String[] args) {
		int i = 120, j = 240;
		System.out.println("Before Swap");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int temp = i;
		i = j;
		j = temp;
		
		System.out.println("After Swap");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}


}

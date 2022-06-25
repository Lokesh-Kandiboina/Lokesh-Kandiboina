
public class Operators {

	public static void main(String[] args) {
		int a = 25;
		int b = 15;
		int c = 0;
		boolean x = true;
		boolean y = false;
	c = a+b;
	System.out.println("addition : "+c);// Arithmetic Operator//
	
	System.out.println("b >= a =" + (b >= a));//  Relational Operator//
	
	System.out.println("x || y = " + (x||y));// Logical Operator//
	
	c += a;
	System.out.println("c += :" + c);// Assignment Operator//
	
	c = a ^ b;
	System.out.println("a ^ b = " + c);// Bitwise Operator//
	
	a = (b == 1) ? 25:50;
	System.out.println("value of a is : " + a);// Conditional Operator//
	
	--b;
	System.out.println("Value of a is : " + b);// Increment and Decrement//
	}
}

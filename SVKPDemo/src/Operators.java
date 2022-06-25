
public class Operators {

	public static void main(String[] args) {
		int a = 25;
		int b = 15;
		int c = 0;
		boolean x = true;
		boolean y = false;
	c = a+b;
	System.out.println("addition : "+c);//Arthimetic Operator//
	
	System.out.println("b >= a =" + (b >= a));// Relactional Operator//
	
	System.out.println("x || y = " + (x||y));// Logiacl Operator//
	
	c += a;
	System.out.println("c += :" + c);//Assignment Operators//
	
	c = a ^ b;
	System.out.println("a ^ b = " + c);//Bitwise Operators//
	
	a = (b == 1) ? 25:50;
	System.out.println("value of a is : " + a);//Conitional Operators//
	
	--b;
	System.out.println("Value of a is : " + b);//Increment and Decrement//
	}
}

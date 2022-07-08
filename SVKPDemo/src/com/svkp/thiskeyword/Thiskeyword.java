package com.svkp.thiskeyword;

public class Thiskeyword {
	int id;
	String name;
	
	public  Thiskeyword(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) {
	
		Thiskeyword obj=new Thiskeyword(101," lokesh");
		obj.display();	
		}

}

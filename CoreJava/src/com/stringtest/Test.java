package com.stringtest;

public class Test {
	public static void main(String[] args) {
		String name="Mayur";
		String last="Ingle";
		String lname = new String("Mayur");
		
		if(name==lname){
			System.out.println("In condition if(name==laname)");
		}
		
		if(name.equals(lname))
		{
			System.out.println("In condition if(name.equals(lname))");
		}
	}

}

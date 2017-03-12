package com.statictest.all;

public class StaticMain {
	static int i=2;
	static int j=i;
	static String name ;
	
	static void change(){  
	      name = "Mayur";  
	     System.out.println(name);
	     }  
	
	public static void main(String[] args) {
		i=i+2;
		System.out.println(i);
		System.out.println(j);
		StaticMain.change();
	}

}

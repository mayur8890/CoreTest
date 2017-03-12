package com.pratices.all;

public class RuntimePol2 extends RuntimePol {
	void add1(int i,int j)
	{
		System.out.println(i+j);
		System.out.println("In Chlid class");
	}
public static void main(String[] args) {
	RuntimePol r1= new RuntimePol();
	r1.add1(23, 23);
	RuntimePol2 r2= (RuntimePol2) new RuntimePol();
	r2.add1(40, 40);
}
}

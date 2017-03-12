package com.pratices.all;

public class AbstractMainClass {
	void add(long j, int i){
		System.out.println("In long and int");

	}
	void add(int i, long j){
		System.out.println("In int and long");
	}
	
public static void main(String[] args) {
	AbstractMainClass ab1=new AbstractMainClass();
	ab1.add(1, 1l);
	}
}

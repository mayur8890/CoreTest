package com.exceptions.ArrayOutOfBound;

import org.apache.log4j.Logger;

public class Test {
	private static org.apache.log4j.Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		 log.trace("Trace Message!");
		String[] arr={"Mayur","Bk","Bhushan","Anuj"};
		
		
		System.out.println(arr[2]);
		 log.trace("Dsoen Message!");
		
		
	}

}

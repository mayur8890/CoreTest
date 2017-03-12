	package com.exceptions;

public class MyExceptionHandle {
	
	 public static void main(String a[]){
	        try{
	            for(int i=5;i>=0;i--){
	                System.out.println(10/i);
	            }
	        } catch(Exception ex){
	            System.out.println("Exception Message: "+ex.getMessage());
	            ex.printStackTrace();
	        }
	        System.out.println("After for loop...");
	    }
	//- See more at: http://www.java2novice.com/java_exception_handling_examples/exception_handling/#sthash.2OHfd0Uk.dpuf

}

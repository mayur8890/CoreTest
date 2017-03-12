package com.practice.others;

public class StringRecursiveReversal {
	  String reverse = "";
	     
	    public String reverseString(String str){
	         
	        if(str.length() == 1){
	            return str;
	        } else {
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	     x`
	    public static void main(String a[]){
	        StringRecursiveReversal srr = new StringRecursiveReversal();
	        System.out.println("Result: "+srr.reverseString("Mayur"));
	    }
	//- See more at: http://www.java2novice.com/java-interview-programs/string-reverse-recursive/#sthash.EwQCfDA7.dpuf
}

package com.stringtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class StingCombination {
	public static void main(String[] args) {
	/*	String str = "www.journaldev.com";
		//System.out.println("Last 4 char String: " + str.subSequence(str.length() - 4, str.length()));
		// substring vs subSequence
		System.out.println("substring == subSequence ? " + (str.substring(4, 14) == str.subSequence(4, 14)));
		System.out.println("substring equals subSequence ? " + (str.substring(4, 14).equals(str.subSequence(4, 14))));
	
	*/
	
	
	
	/*
		 String line = "I,am a java developer";
	        String[] words = line.split(",");
	        String[] twoWords = line.split(",", 2);
	      
	        
	        
	        
	        
	        System.out.println("String split with delimiter: "+Arrays.toString(words));
	        System.out.println("String split into two: "+Arrays.toString(twoWords));
	        //split string delimited with special characters
	        String wordsWithNumbers = "I|am|a|java|developer";
	        String[] numbers = wordsWithNumbers.split("\\|");
	        System.out.println("String split with special character: "+Arrays.toString(numbers));
	    
	*/
		
		/*List<String> strList = new ArrayList<String>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
         
        String[] strArr = null;
         
        strArr = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(strArr));
        
        */
		
		 String[] strArr = {"E", "A", "U","O","I"};
	        //sort int array
		 int[] intArr = {1, 4, 2, 6, 3};
	        Arrays.sort(intArr);
	        Arrays.sort(strArr);
	         
	        System.out.println(Arrays.toString(intArr));
	        System.out.println(Arrays.toString(strArr));
	
	
	
	
	
	
	
	
	
	
	}

}

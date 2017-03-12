package com.practice.others;

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
  public static void main(String arr[]){
	  
	  String[] names = new String[4];
	  names[0] = "Books";
	  names[1] = "Books";
	  names[2] = "Pencils";
	  names[3] = "Notebooks";

  
	  for (int i = 0; i < names.length; i++)
	  { 
		  for (int j = i+1 ; j < names.length; j++)
		  { 
			  if (names[i].equals(names[j]))
			  { 
				  System.out.println("Dublicate");
				  // got the duplicate element
				  }else{
					  System.out.println("False");
				  } } }
			  }
		  }
	  

package com.ArrayOperations;
import java.util.*;

//import com.sun.java_cup.internal.runtime.Scanner;

public class SortingWithKeyword {
	public static void main(String[] args) {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of values ");
		n=s.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the value ");
		//Scanner  = new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]= s.nextInt();
		}
		
		  for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	            	if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                
	                    a[i] = a[j];

	                  
	                    a[j] = temp;
	                

	        }
	            }}
		  System.out.print("Ascending Order:");
	        for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	      //  System.out.print(a[n - 1]);
	}

}

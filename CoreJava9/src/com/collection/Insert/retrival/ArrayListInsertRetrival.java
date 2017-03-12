package com.collection.Insert.retrival;

import java.util.*;
public class ArrayListInsertRetrival {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
		list.add("Maur");
		list.add("Vivek");
		list.add("BK");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
	
	}
}

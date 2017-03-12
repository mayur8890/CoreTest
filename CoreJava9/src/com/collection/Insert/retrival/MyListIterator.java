package com.collection.Insert.retrival;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sun.accessibility.internal.resources.accessibility;

public class MyListIterator {
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		ListIterator<String> ll=null;
		list.add("Mayur");
		list.add("Hin");
		list.add("Nhu");
		list.add("kiy");
		System.out.println(list);
		listl=list.listIterator();
		while(listl.hasNext()){
			
			System.out.println(listl.next());
			
		}
System.out.println("pHASE 2");
while(listl.hasPrevious()){
			
			System.out.println(listl.previous());
			
		}
		
		
	}

}

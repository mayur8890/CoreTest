package com.ArrayOperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArralistUsingSortKeyWord {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Mayur");
	list.add("BK");
	list.add("Bhusan");
	list.add("Anuj");
	list.add("Poonam");
	list.add("Shilpa");
	Collections.sort(list);
	System.out.println(list);
	Iterator itr=list.iterator(); 
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}

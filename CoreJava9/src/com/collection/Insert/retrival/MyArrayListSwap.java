package com.collection.Insert.retrival;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArrayListSwap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mayur");
		list.add("Anuj");
		list.add("Balu");
		list.add("shilpa");
		list.add("anuj");
		
		Collections.swap(list, 2, 3);
		
		for(String str: list){
			System.out.println(str);
		}
		
	}

}

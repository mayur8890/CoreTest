package com.collection.Insert.retrival;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListReverse {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mayur");
		list.add("Anuj");
		list.add("Balu");
		list.add("shilpa");
		list.add("anuj");
		
		Collections.reverse(list);
		System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
        
//- See more at: http://www.java2novice.com/java-collections-and-util/arraylist/content-reverse/#sthash.Q9Bdb9QC.dpuf
		
		
	}

}

package com.collection.Insert.retrival;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapBasicOperation {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();

		ht.put("one","Mayur");
		ht.put("two","BK");
		ht.put("three","BL");
		ht.put("four","Mayur");
		
		System.out.println(ht);
		System.out.println(ht.get("two"));
		System.out.println(ht.size());
	}

}

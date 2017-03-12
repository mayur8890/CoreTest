package com.collection.Insert.retrival;

import java.util.Hashtable;
import java.util.Set;

public class HashTableRead {
	public static void main(String a[]){
        Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("first","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
//- See more at: http://www.java2novice.com/java-collections-and-util/hashtable/all-keys/#sthash.xYEk3awM.dpuf
}

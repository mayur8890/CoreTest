package com.collection.Insert.retrival;
import java.util.*;

public class MyElementCheckVector {
	public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println(vct.contains("First"));
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
    }
//- See more at: http://www.java2novice.com/java-collections-and-util/vector/vector-list-contains/#sthash.R6l86XZY.dpuf

}

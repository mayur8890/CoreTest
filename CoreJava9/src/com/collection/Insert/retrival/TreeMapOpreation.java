package com.collection.Insert.retrival;
import java.util.*;

public class TreeMapOpreation {
	 public static void main(String a[]){
         
	        TreeSet<String> ts = new TreeSet<String>(new MyComp());
	        ts.add("RED");
	        ts.add("ORANGE");
	        ts.add("BLUE");
	        ts.add("MAYUR");
	        System.out.println(ts);
	    }
	//- See more at: http://www.java2novice.com/java-collections-and-util/treeset/with-comparator/#sthash.aAiFXhpk.dpuf

}
class MyComp implements Comparator<String>{
	 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}
//- See more at: http://www.java2novice.com/java-collections-and-util/treeset/with-comparator/#sthash.aAiFXhpk.dpuf

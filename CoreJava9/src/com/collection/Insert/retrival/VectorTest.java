package com.collection.Insert.retrival;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        vct.addAll(list);
        System.out.println("After Copy: "+vct);
    }
//- See more at: http://www.java2novice.com/java-collections-and-util/vector/list-to-vector/#sthash.fvbi5JeP.dpuf
	
}

package com.collection.Insert.retrival;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {
	 public static void main(String a[]){
	        Vector<String> lang = new Vector<String>();
	        Enumeration<String> en = null;
	        lang.add("JAVA");
	        lang.add("JSP");
	        lang.add("SERVLET");
	        lang.add("EJB");
	        lang.add("PHP");
	        lang.add("PERL");
	        en = lang.elements();
	        while(en.hasMoreElements()){
	            System.out.println(en.nextElement());
	        }
	    }
//	- See more at: http://www.java2novice.com/java-collections-and-util/enumeration-example/#sthash.5lwHl1dA.dpuf

}

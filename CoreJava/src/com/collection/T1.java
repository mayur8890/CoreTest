package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class T1 {
	public static void main(String args[]){  
		/*PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Bijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  */
		HashSet <String> Obj= new HashSet<String>();
		//to add elements 
		Obj.add("Element1");Obj.add("Element2");Obj.add("Element3");Obj.add(null);Obj.add("Element1");
	


		//to display elements
		System.out.println(Obj);
		//to remove elements
		Obj.remove("Element1");

		}  
}

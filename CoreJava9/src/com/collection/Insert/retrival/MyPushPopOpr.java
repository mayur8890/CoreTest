package com.collection.Insert.retrival;

import java.util.LinkedList;

public class MyPushPopOpr {
	public static void main(String[] args) {
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        arrl.push("push element");
        System.out.println("After push operation:");
        System.out.println(arrl);
        arrl.pop();
        System.out.println("After pop operation:");
        System.out.println(arrl);
//- See more at: http://www.java2novice.com/java-collections-and-util/linkedlist/push-pop/#sthash.ZhBx3xWX.dpuf
	}

}

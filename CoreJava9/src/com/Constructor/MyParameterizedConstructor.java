package com.Constructor;

public class MyParameterizedConstructor {
	
	private String name;
    
    public MyParameterizedConstructor(String str){
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+str);
    }
     
    public static void main(String a[]){
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("Madhu Raj");
    }
//- See more at: http://www.java2novice.com/java_constructor_examples/constructor_with_parameters/#sthash.hnq2v8IA.dpuf

}

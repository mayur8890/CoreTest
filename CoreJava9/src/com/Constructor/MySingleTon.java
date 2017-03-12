package com.Constructor;

public class MySingleTon {private static MySingleTon myObj;
/**
 * Create private constructor
 */
private MySingleTon(){
     
}
/**
 * Create a static method to get instance.
 */
public static MySingleTon getInstance(){
    if(myObj == null){
        myObj = new MySingleTon();
    }
    return myObj;
}
 
public void getSomeThing(){
    // do something here
    System.out.println("I am here....");
}
 
public static void main(String a[]){
    MySingleTon st = MySingleTon.getInstance();
    st.getSomeThing();
}
//- See more at: http://www.java2novice.com/java_constructor_examples/singleton/#sthash.ktrXrobm.dpuf

}

package com.core;

import java.io.IOException;

public class MyInvokeOtherApps {
	public static void main(String a[]){
        
        ProcessBuilder pb = new ProcessBuilder("java", "MyTest");
        try {
            pb.start();
            System.out.println("Process has been started.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

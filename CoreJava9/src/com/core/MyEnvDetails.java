package com.core;

import java.util.Map;
import java.util.Set;

public class MyEnvDetails {
	
	public static void main(String a[]){
        
        ProcessBuilder pb = new ProcessBuilder();
        Map<String, String> envMap = pb.environment();
        Set<String> keys = envMap.keySet();
        for(String key:keys){
            System.out.println(key+" ==> "+envMap.get(key));
        }
    }
//- See more at: http://www.java2novice.com/java-fundamentals/process-builder/env-details/#sthash.vSWWEhad.dpuf

}

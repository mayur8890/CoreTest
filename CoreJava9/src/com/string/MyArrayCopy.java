package com.string;

public class MyArrayCopy {
	public static void main(String[] args) {
		char ch[] = {'m','a','y','u','r'};
		
		String chStr = String.copyValueOf(ch);
        System.out.println(chStr);

        String substring = String.copyValueOf(ch, 1, 4);
        System.out.println(substring);
	}
	

}

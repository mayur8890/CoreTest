package com.practi.interviewprograms;

public class NumberReverse {
	public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
     
    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(10));
        int number=11;
        int i = number%10;
        System.out.println(i);
    }
//- See more at: http://www.java2novice.com/java-interview-programs/reverse-number/#sthash.duN0BpDY.dpuf
}

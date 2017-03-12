package com.exceptions.nullpointer;

public class TestSingleton
{
    public static void main(String[] args)
    {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getID());
    }
}


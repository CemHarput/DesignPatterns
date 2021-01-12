package com.company;

public class Government {
    private static Government singleton=new Government();

    private Government() {
    }

    public static Government getInstance(){
        return singleton;
    }

    protected static void demoMethod(){
        System.out.println("Test method for singleton");
    }
}

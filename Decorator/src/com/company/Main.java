package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gun gun1=new FlashLight(new GunImpl());


        System.out.println(" " +gun1.decorate());


        Gun gun2=new Scope(new FlashLight(new GunImpl()));

        System.out.println(""+gun2.decorate());

    }
}

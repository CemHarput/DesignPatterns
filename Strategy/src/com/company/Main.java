package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context=new Context(new Sum());
        System.out.println("5 + 3 = "+context.executeCalculator(5,3));

        context=new Context(new Multiply());
        System.out.println("5 * 3 = "+context.executeCalculator(5,3));

        context=new Context(new Subs());
        System.out.println("5 - 3 = "+context.executeCalculator(5,3));

    }
}

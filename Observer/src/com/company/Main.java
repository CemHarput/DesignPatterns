package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Subject subject=new Subject();
        new SportObserver(subject);
        new ForecastObserver(subject);

        subject.setState("and the weather is  15 degrees.");

        System.out.println(""+subject.getState());

    }
}

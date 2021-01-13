package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Weight human1=new Human();
        WeightAdapter humanAdapter=new MovableAdapterImpl(human1);

        System.out.println("Weight:"+humanAdapter.getWeight());

    }
}

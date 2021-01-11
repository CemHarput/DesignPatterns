package com.company;



public class Main {

    public static void main(String[] args) {

  //   Pizza test=new Pizza("Pepperoni",80,1);
  //   Hamburger test2=new Hamburger("Wropper",100,0);

 //    test.calculation();
 //    test2.calculation();
 //    System.out.println("The pizza price is:"+test.getPrice());
 //    System.out.println("The Hamburger is:"+test2.getPrice());
 //TRADITIONAL METHOD

     Food test = FoodFactory.createFood("Pizza","Pepperoni",80,0);
     Food test1= FoodFactory.createFood("Hamburger","Cheese",50,1);

    System.out.println("First Order:"+test);
    System.out.println("Second Order:"+test1);


    }
}

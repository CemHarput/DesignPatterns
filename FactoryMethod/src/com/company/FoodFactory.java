package com.company;

public class FoodFactory {
    public static  Food createFood(String food,String name,int price,int type) {
          if("Pizza".equalsIgnoreCase(food))
          {return new Pizza(name, price, type);}
          else if("Hamburger".equalsIgnoreCase(food))

          { return new Hamburger(name, price, type);}
          else
          {return null;}
    }
}

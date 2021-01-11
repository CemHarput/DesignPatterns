package com.company;

import com.company.Door.Door;
import com.company.Explosives.Explosive;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AbstractFactory test=  FactoryProvider.getFactory("Door");
        Door door1= (Door) test.create("WoodenDoor");
        door1.getDescription();
        System.out.println(""+door1);

        AbstractFactory test2 = FactoryProvider.getFactory("Explosive");
        Explosive exp1=(Explosive) test2.create("Rocket");
        exp1.getDescription();
        System.out.println(""+exp1);

    }
}

package com.company;

import com.company.Door.Door;
import com.company.Explosives.Explosive;

public class FactoryProvider {
    public static AbstractFactory getFactory(String type){
        if("Door".equalsIgnoreCase(type)){
            return new DoorFactory();

        }
        if("Explosive".equalsIgnoreCase(type)){

            return new ExplosiveFactory();
        }
        else{
            return null;
        }

    }
}

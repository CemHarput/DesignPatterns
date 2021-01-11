package com.company;

import com.company.Door.Door;
import com.company.Door.MetalSheetDoor;
import com.company.Door.WoodenDoor;

public class DoorFactory implements AbstractFactory<Door> {
    @Override
    public Door create(String doorType) {
        if("WoodenDoor".equalsIgnoreCase(doorType)){

            return new WoodenDoor(50);
        }
        if ("MetalSheetDoor".equalsIgnoreCase(doorType)){
            return new MetalSheetDoor(100);
        }
        if ("ArmoredDoor".equalsIgnoreCase(doorType)){
            return new MetalSheetDoor(200);
        }
        else
        {
            return null;
        }


    }
}

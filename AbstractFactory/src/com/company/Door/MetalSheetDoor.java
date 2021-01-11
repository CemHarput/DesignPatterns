package com.company.Door;

import com.company.Door.Door;

public class MetalSheetDoor implements Door {
    private int durability;//100

    public MetalSheetDoor(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public void getDescription() {
        System.out.println("This is metal sheet door.");
    }

    @Override
    public String toString() {
        return "MetalSheetDoor{" +
                "durability=" + durability +
                '}';
    }
}

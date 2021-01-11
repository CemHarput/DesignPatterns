package com.company.Door;

import com.company.Door.Door;

public class WoodenDoor implements Door {
    private int durability;//50

    public WoodenDoor(int durability) {
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
        System.out.println("This is wooden door");
    }

    @Override
    public String toString() {
        return "WoodenDoor{" +
                "durability=" + durability +
                '}';
    }
}

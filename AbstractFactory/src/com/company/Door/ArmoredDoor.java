package com.company.Door;

import com.company.Door.Door;

public class ArmoredDoor implements Door {

    private int durability;//200

    public ArmoredDoor(int durability) {
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
        System.out.println("This is armored door");
    }

    @Override
    public String toString() {
        return "ArmoredDoor{" +
                "durability=" + durability +
                '}';
    }
}

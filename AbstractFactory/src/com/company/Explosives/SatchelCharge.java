package com.company.Explosives;

public class SatchelCharge implements Explosive {
    private int power;//50

    public SatchelCharge(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void getDescription() {
        System.out.println("I can destroy Wooden Doors");
    }

    @Override
    public String toString() {
        return "SatchelCharge{" +
                "power=" + power +
                '}';
    }
}

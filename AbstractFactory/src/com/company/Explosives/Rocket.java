package com.company.Explosives;

public class Rocket implements Explosive {
    private int power;//100

    public Rocket(int power) {
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
        System.out.println("I can destroy Sheet Metal Doors");
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "power=" + power +
                '}';
    }
}

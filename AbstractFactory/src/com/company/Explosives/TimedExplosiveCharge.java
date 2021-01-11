package com.company.Explosives;

public class TimedExplosiveCharge implements Explosive {
    private int power;//200

    public TimedExplosiveCharge(int power) {
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
        System.out.println("I can destroy Armored Doors");
    }

    @Override
    public String toString() {
        return "TimedExplosiveCharge{" +
                "power=" + power +
                '}';
    }
}

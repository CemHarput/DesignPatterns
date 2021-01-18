package com.company;

public class AirconditionReceiver implements HomeElectronics {

    @Override
    public void on() {
        System.out.println("Aircondition is on!");
    }

    @Override
    public void off() {
        System.out.println("Aircondition is off");
    }
}

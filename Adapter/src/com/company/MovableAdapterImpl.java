package com.company;

public class MovableAdapterImpl implements WeightAdapter{
    private Weight humans;

    public MovableAdapterImpl(Weight humans) {
        this.humans = humans;
    }


    @Override
    public double getWeight() {
        return convertKGtoPOUND(humans.getWeight());
    }
    private double convertKGtoPOUND(double kg){
        return kg*2.20;
    }

}

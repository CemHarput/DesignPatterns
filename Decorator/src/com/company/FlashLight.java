package com.company;

public class FlashLight extends GunDecorator {

    public FlashLight(Gun gun) {
        super(gun);
    }


    public String decorate() {
        return super.decorate()+decorateWithFlashLight();
    }
    private String decorateWithFlashLight(){
        return " with FlashLight";
    }
}

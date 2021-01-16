package com.company;

public abstract class GunDecorator implements Gun {
     private Gun gun;

    public GunDecorator(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String decorate() {
        return gun.decorate();
    }
}

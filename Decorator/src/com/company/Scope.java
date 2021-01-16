package com.company;

public class Scope extends GunDecorator {
    public Scope(Gun gun) {
        super(gun);
    }


    public String decorate() {
        return super.decorate() + decorateWithScope();
    }


    private String decorateWithScope(){
        return " with Scope";
    }
}

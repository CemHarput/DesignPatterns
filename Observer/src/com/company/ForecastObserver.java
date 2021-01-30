package com.company;

public class ForecastObserver extends Observer{
    private Subject subject;

    public ForecastObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {

        System.out.println("This is forecast channel "+subject.getState());

    }
}

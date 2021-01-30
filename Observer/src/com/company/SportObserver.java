package com.company;

public class SportObserver extends Observer {
    private  Subject subject;

    public SportObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("This is a sport channel "+ subject.getState());


    }
}

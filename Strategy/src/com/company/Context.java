package com.company;

public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }
    public int executeCalculator(int num1,int num2){
        return calculator.Calculation(num1,num2);
    }
}

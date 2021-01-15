package com.company;

public class AfterFinal implements GradeState{
    private GradeContext GradeSystem;

    public AfterFinal(GradeContext gradeSystem) {
        GradeSystem = gradeSystem;
    }

    @Override
    public void Fail() {
        System.out.println("You have failed the course.");
    }

    @Override
    public void Pass() {
        System.out.println("You have successfully pass the course.");
    }
}

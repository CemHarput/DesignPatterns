package com.company;

public class BeforeFinal implements GradeState {

    private GradeContext GradeSystem;

    public BeforeFinal(GradeContext gradeSystem) {
        GradeSystem = gradeSystem;
    }

    @Override
    public void Fail() {
        System.out.println("You can't take the final exam.You will get FZ grade.");
    }

    @Override
    public void Pass() {
        System.out.println("You can take the final exam.");
    }


}

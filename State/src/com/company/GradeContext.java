package com.company;

public class GradeContext {

     GradeState beforeFinal;
     GradeState afterFinal;
     GradeState currentState=new BeforeFinal(this);

    public GradeContext() {

        beforeFinal = new BeforeFinal(this);
        afterFinal = new AfterFinal(this);
    }
    public void Fail(){
        currentState.Fail();
    }
    public void Pass(){
        currentState.Pass();
    }

}

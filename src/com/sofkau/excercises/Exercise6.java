package com.sofkau.excercises;

public class Exercise6 extends Exercise5{
    @Override
    public void generateCounter(){
        for(int counter = 1; counter<=100; counter++){
            showNumber(counter);
        }
    }
}

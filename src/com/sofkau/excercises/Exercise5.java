package com.sofkau.excercises;

public class Exercise5 {
    public void generateCounter(){
        int counter = 1;
        while(counter<=100){
            showNumber(counter);
            counter++;
        }
    }

    public boolean isEven(int number) {
        boolean isEven;
        isEven = number % 2 == 0 ? true : false;
        return isEven;
    }

    public void showNumber(int counter){
        if(isEven(counter)){
            System.out.println("Even: " + counter);
        }
        else {
            System.out.println("Odd: " + counter);
        }
    }
}

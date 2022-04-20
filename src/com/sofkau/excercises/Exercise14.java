package com.sofkau.excercises;

import java.util.Scanner;

public class Exercise14 {
    protected int number;

    public void requestNumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        this.number = keyboard.nextInt();
    }

    public void printNumbers(){
        int counter = this.number;
        while (counter<=1000){
            System.out.println(counter);
            counter+=2;
        }
    }
}

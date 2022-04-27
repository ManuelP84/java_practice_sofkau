package com.sofkau.exercises1to15;

import java.util.Scanner;

public class Exercise7 {
    protected int number;

    public void generateCycle() {
        do {
            requestNumber();
            getNumber();
        } while (this.number < 0);
    }

    public void requestNumber() {
        System.out.println("Please enter a number: ");
    }

    public void getNumber() {
        Scanner keyboard = new Scanner(System.in);
        this.number = keyboard.nextInt();
    }

    public void showNumber() {
        if (this.number >= 0) {
            System.out.println("The number is: " + this.number);
        }
    }
}

package com.sofkau.exercises1to15;

import java.util.Scanner;

public class Exercise2 extends Exercise1 {

    public void requestData(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the score 1: ");
        score1 = Float.parseFloat(keyboard.nextLine());
        System.out.println("Please enter the score 2: ");
        score2 = Float.parseFloat(keyboard.nextLine());
    }
}

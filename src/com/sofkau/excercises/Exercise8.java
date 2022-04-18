package com.sofkau.excercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    String day;
    boolean isLabor;

    public void requestDay(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the day of the week: ");
        this.day = keyboard.nextLine().toLowerCase();
    }

    public void isLabor(){
        switch (this.day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                this.isLabor =  true;
                break;
            case "saturday":
            case "sunday":
                this.isLabor = false;
                break;
        }
    }

    public String compareDay(){
        if(this.isLabor){
            return "Is labor day";
        }
        return "Is not labor day";
    }

    public void showIsLabor(){
        System.out.println(compareDay());
    }
}


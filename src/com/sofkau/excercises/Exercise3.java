package com.sofkau.excercises;

import java.util.Scanner;

public class Exercise3 {
    private Double radius;
    private Double area;

    public void requestRadius(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        radius = Double.parseDouble(keyboard.nextLine());
    }

    public void calculateArea(){
        area = Math.PI*Math.pow(this.radius, 2);
    }

    public void showArea(){
        System.out.println("The area of the circle is: " + this.area);
    }
}

package com.sofkau.exercises1to15;

import java.util.Scanner;

public class Exercise4 {
    protected final double IVA = 0.21;
    protected double priceWithIva;
    protected double price;

    /**
     * Function which calculates the product price without IVA
     * */
    public void calculatePrice(){
        this.priceWithIva = this.price*IVA + this.price;
    }

    public void requestPrice(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the product price: ");
        this.price = Double.parseDouble(keyboard.nextLine());
    }

    public void showPriceWithIva(){
        System.out.println("The product price is: " + this.priceWithIva);
    }
}

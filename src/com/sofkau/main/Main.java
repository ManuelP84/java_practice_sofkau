package com.sofkau.main;

import com.sofkau.excercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        showMenu();
        option = getOption();

        switch (option) {
            case 1:
                Exercise1 exercise1 = new Exercise1();
                exercise1.compareScore();
                break;
            case 2:
                Exercise2 exercise2 = new Exercise2();
                exercise2.requestData();
                exercise2.compareScore();
                break;
            case 3:
                Exercise3 exercise3 = new Exercise3();
                exercise3.requestRadius();
                exercise3.calculateArea();
                exercise3.showArea();
                break;
            case 4:
                Exercise4 exercise4 = new Exercise4();
                exercise4.requestPrice();
                exercise4.calculatePrice();
                exercise4.showPriceWithIva();
            case 5:
                Exercise5 exercise5 = new Exercise5();
                exercise5.generateCounter();
            case 6:
                Exercise5 exercise6 = new Exercise6();
                exercise6.generateCounter();
            case 7:
                Exercise7 exercise7 = new Exercise7();
                exercise7.requestNumber();
                exercise7.getNumber();
                exercise7.showNumber();
            case 8:
                Exercise8 exercise8 = new Exercise8();
                exercise8.requestDay();
                exercise8.isLabor();
                exercise8.showIsLabor();
            case 9:
                Exercise9 exercise9 = new Exercise9();
                exercise9.replaceLetter();
                exercise9.concatPhrase();
            case 10:
                Exercise10 exercise10 = new Exercise10();
                exercise10.requestPhrase();
                String phrase = exercise10.deleteSpaces();
                exercise10.showPhrase(phrase);
            case 11:
                Exercise11 exercise11 = new Exercise11();
                exercise11.requestPhrase();
                exercise11.getPhraseSize();
                exercise11.countVowels();
                exercise11.showDetailVowels();
            case 12:
                Exercise12 exercise12 = new Exercise12();
                exercise12.requestWords();
                exercise12.wordsDifference();
                exercise12.isEqual();
                exercise12.isDifferent();
        }
    }

    public static void showMenu () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select the excercise you want to run!");
        System.out.println("1. Numeric variables");
        System.out.println("2. Numeric variables. Keyboard enter.");
        System.out.println("3. Calculate circle area.");
        System.out.println("4. Calculate IVA.");
        System.out.println("5. Show numbers. (Using while)");
        System.out.println("6. Show numbers. (Using for)");
        System.out.println("7. Number greater or equal 0");
        System.out.println("8. Is labor day");
        System.out.println("9. Replace 'a' with 'e' ");
        System.out.println("10. Delete spaces");
        System.out.println("11. Count total vowels of a phrase");
        System.out.println("12. Compare two words");
        System.out.print("Option: ");
    }

    public static int getOption() {
        int option;
        Scanner keyboard = new Scanner(System.in);
        option = Integer.parseInt(keyboard.nextLine());
        return option;
    }
}

package com.sofkau.exercises1to15;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Exercise12 {
    protected String word1;
    protected String word2;
    protected String word1DiffWord2;
    protected String word2DiffWord1;
    protected boolean isEqual = false;

    public void requestWords(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        this.word1 = keyboard.nextLine().toLowerCase();
        System.out.println("Please enter the second word: ");
        this.word2 = keyboard.nextLine().toLowerCase();
    }

    public void wordsDifference(){
        String word1DiffWord2;
        String word2DiffWord1;

        this.word1DiffWord2 = StringUtils.difference(word1, word2);
        this.word2DiffWord1 = StringUtils.difference(word2, word1);
    }

    public void isEqual(){
        if (this.word1DiffWord2 == "" && this.word2DiffWord1 == ""){
            System.out.println("The words are the same!");
            this.isEqual = true;
        }
    }

    public void isDifferent(){
        if (this.word2DiffWord1.length() != 0){
            System.out.println("The word: " + this.word1 + " has the following additional characters from the word : " + this.word2 + " : " + this.word2DiffWord1);
        }
        if (this.word1DiffWord2.length() != 0){
            System.out.println("The word: " + this.word2 + " has the following additional characters from the word : " + this.word1 + " : " + this.word1DiffWord2);
        }

    }

}
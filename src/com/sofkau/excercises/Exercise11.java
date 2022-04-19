package com.sofkau.excercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise11 {
    protected String phrase;
    protected int phraseSize;
    protected int countVowels;
    protected int[] totalVowels = new int[5];

    public void requestPhrase(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a phrase. It will count how many vowels it has!...");
        this.phrase = keyboard.nextLine();
    }

    public void getPhraseSize(){
        this.phraseSize = this.phrase.length();
        System.out.println("The phrase length is: " + this.phraseSize );
    }

    public void countVowels(){
        int countVowels = 0;
        int index = 0;
        char[] chars = this.phrase.toCharArray();
        while (index<chars.length){
            countVowels += sumVowel(chars[index]);
            index++;
        }

        this.countVowels = countVowels;
        System.out.println("The total vowels is: " + this.countVowels );
    }

    public int sumVowel(char my_char){
        int count = 0;
        switch (my_char){
            case 'a':
                this.totalVowels[0]++;
                count++;
                break;
            case 'e':
                this.totalVowels[1]++;
                count++;
                break;
            case 'i':
                this.totalVowels[2]++;
                count++;
                break;
            case 'o':
                this.totalVowels[3]++;
                count++;
                break;
            case 'u':
                this.totalVowels[4]++;
                count++;
                break;

        }
        return count;
    }

    public void showDetailVowels(){
        System.out.println("Total 'a' : " + this.totalVowels[0]);
        System.out.println("Total 'e' : " + this.totalVowels[1]);
        System.out.println("Total 'i' : " + this.totalVowels[2]);
        System.out.println("Total 'o' : " + this.totalVowels[3]);
        System.out.println("Total 'u' : " + this.totalVowels[4]);
    }
}

package com.sofkau.excercises;

import java.util.Scanner;

public class Exercise10 {
    protected String phrase;

    public void requestPhrase(){
        System.out.println("Please enter a phrase: ");
        Scanner keyboard = new Scanner(System.in);
        this.phrase = keyboard.nextLine();
    }

    public String deleteSpaces(){
        String new_phrase = "";
        char[] chars = this.phrase.toCharArray();

        for(int index=0; index<chars.length; index++){
            new_phrase = !compareEmptyChar(chars[index])? new_phrase + chars[index]:new_phrase;
        }
        return new_phrase;
    }

    public boolean compareEmptyChar(char my_char){
        boolean isEmpty = false;
        isEmpty = my_char == ' '? true:false;
        return isEmpty;
    }

    public void showPhrase(String phrase){
        System.out.println(phrase);
    }
}

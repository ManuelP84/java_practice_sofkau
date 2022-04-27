package com.sofkau.exercises1to15;

public class Exercise9 {
    protected final String PHRASE = "La sonrisa sera la mejor arma contra la tristeza";
    protected       String new_replaced_phrase;
    protected       String new_phrase;

    public void replaceLetter() {
        this.new_phrase = PHRASE.replace('a', 'e');
    }

    public void concatPhrase() {
        System.out.println(new_phrase + " y no hay tristeza que no se pueda vencer con una sonrisa!");
    }
}

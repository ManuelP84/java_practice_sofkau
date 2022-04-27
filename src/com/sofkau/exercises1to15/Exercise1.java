package com.sofkau.exercises1to15;

public class Exercise1 {
    protected float score1 = 4.8F;
    protected float score2 = 3.9F;

    public void compareScore() {
        if (score1 > score2) {
            System.out.println(this.score1 + " is greater than " + this.score2);
        } else if (score1 < score2) {
            System.out.println(this.score2 + " is greater than " + this.score1);
        } else {
            System.out.println("The score 1 is equal to score 2 : " + this.score1);
        }
    }
}

package com.sofkau.excercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise13 {
    protected LocalDateTime currentDateTime;
    protected String stringDateTime;

    public void generateDateTime(){
        this.currentDateTime = LocalDateTime.now();
    }

    public void formatDateTime(){
        DateTimeFormatter dateTimeFormated = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        this.stringDateTime = dateTimeFormated.format(this.currentDateTime);
    }

    public void showDateTime(){
        System.out.println("The local date and time in the following format (AAAA/MM/DD) (HH:MM:SS) is: ");
        System.out.println(this.stringDateTime);
    }
}

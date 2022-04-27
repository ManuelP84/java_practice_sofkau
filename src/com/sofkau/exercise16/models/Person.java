package com.sofkau.exercise16.models;

import java.util.Random;

public class Person {
    private       String  name;
    private       Integer age;
    private       String  dni;
    private       String  gender;
    private       Double  height;
    private       Double  weight;
    private final String  HOMBRE = "H";
    private final String  MUJER  = "M";
    private       Double  imc;

    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.height = 0.0;
        this.weight = 0.0;
        generateDNI();
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender.toUpperCase();
        this.height = 0.0;
        this.weight = 0.0;
        generateDNI();
    }

    public Person(String name, Integer age, String gender, Double height, Double weight) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.gender = gender.toUpperCase();
        ;
        this.height = height;
        this.weight = weight;
        generateDNI();
    }

    public int calcularIMC() {
        this.imc = (this.weight) / (Math.pow(this.height, 2));
        int value;
        if (this.imc < 20) {
            value = -1;
        } else if (this.imc >= 20 && this.imc <= 25) {
            value = 0;
        } else {
            value = 1;
        }
        return value;
    }

    public boolean esMayorDeEdad() {
        return this.age > 18 ? true : false;
    }

    public void comprobarSexo(String gender) {
        gender = gender.toUpperCase();
        String compareGender;
        if (gender == "M") {
            compareGender = "M";
        } else {
            compareGender = "M";
        }
        System.out.println("The gender is: " + compareGender);
    }

    @Override
    public String toString() {
        return "Person name is: " + name + "\n" +
                "Person age is: " + age + "\n" +
                "Person DNI is: " + dni + "\n" +
                "Person gender is: " + gender + "\n" +
                "Person height is: " + height + "\n" +
                "Person weight is: " + weight + "\n";
    }

    public void generateDNI() {
        String characters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int charIndex;
        String dniLetter;
        int dniNumber = createRandomNumber();

        charIndex = dniNumber % 23;
        dniLetter = String.valueOf(characters.charAt(charIndex));
        this.dni = dniNumber + dniLetter;
    }

    private int createRandomNumber() {
        int dniNumber;
        int count = 0;
        int number;
        String stringDniNumber = "";
        Random rand = new Random();

        while (count < 8) {
            number = rand.nextInt(10);
            stringDniNumber = stringDniNumber + number;
            count++;
        }
        dniNumber = Integer.parseInt(stringDniNumber);

        return dniNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
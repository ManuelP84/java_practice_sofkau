package com.sofkau.exercise16.main;

import com.sofkau.exercise16.models.Person;

import java.util.Scanner;

public class Main {
    static String  name;
    static Integer age;
    static String  gender;
    static Double  weight;
    static Double  height;

    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("Please enter the information of the first person.");
        requestPersonInfo();
        Person person1 = new Person(name, age, gender, height, weight);
        System.out.println(person1);
        isGoodCondition(person1);

        System.out.println("**********************************************");
        System.out.println("Please enter the information of the second person.");
        requestPersonInfo();
        Person person2 = new Person(name, age, gender);
        person2.setHeight(height);
        person2.setWeight(weight);
        System.out.println(person2);
        isGoodCondition(person2);

        System.out.println("**********************************************");
        Person person3 = new Person();
        person3.setName("Manuel");
        person3.setAge(37);
        person3.setGender("M");
        person3.setHeight(1.75);
        person3.setWeight(81.5);
        System.out.println(person3);
        isGoodCondition(person3);

        System.out.println("**********************************************");
    }

    public static void requestPersonInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = keyboard.nextLine();
        System.out.println("Enter the age: ");
        age = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter the gender (M/F): ");
        gender = keyboard.nextLine();
        System.out.println("Enter the height: ");
        height = keyboard.nextDouble();
        System.out.println("Enter the weight: ");
        weight = keyboard.nextDouble();
    }

    public static void isGoodCondition(Person person) {
        Integer imc;
        imc = person.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println("Below ideal weight");
                break;
            case 0:
                System.out.println("Ideal weight");
                break;
            case 1:
                System.out.println("Is overweight");
                break;
        }
    }
}
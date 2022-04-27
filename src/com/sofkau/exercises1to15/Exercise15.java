package com.sofkau.exercises1to15;

import java.util.Scanner;

public class Exercise15 {

    public void showGestionMenu() {

        System.out.println("******GESTION CINEMATOGRÁFICA******");
        System.out.println("1. NUEVO ACTOR");
        System.out.println("2. BUSCAR ACTOR");
        System.out.println("3. ELIMINAR ACTOR");
        System.out.println("4. MODIFICAR ACTOR");
        System.out.println("5. VER TODOS LOS ACTORES");
        System.out.println("6. VER PELICULAS DE LOS ACTORES");
        System.out.println("7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8. SALIR");
    }

    public int selectOption() {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        try {
            option = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a integer number between 1 t 8!");
        }
        return option;
    }

    public void mainPanel() {
        int option;
        do {
            showGestionMenu();
            option = selectOption();
            validateOption(option);
        } while (option != 8);
    }

    public void validateOption(int option) {
        if (option > 8 || option < 1) {
            System.out.println("Opcion incorrecta!");
        }
    }
}

package com.sofkau.exercise17.main;

import com.sofkau.exercise17.models.Electrodomestico;
import com.sofkau.exercise17.models.Lavadora;
import com.sofkau.exercise17.models.Television;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Electrodomestico electrodomesticos[] = new Electrodomestico[3];
        //Lavadora lavadoras[] = new Lavadora[3];
        List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

        Double precio;
        String color;
        String consumoEnergetico;
        Double peso;
        Integer carga;
        Double resolucion;
        String sintonizador;


        // Creamos 4 electrodomesticos
        System.out.println("********************************************************************");
        System.out.println("Por favor ingresa la información de los electrodomesticos...");
        System.out.println("********************************************************************");
        for (int index=1; index<5; index++){
            System.out.println("Please enter the price from the item: " + index);
            precio = Double.parseDouble(keyboard.nextLine());
            System.out.println("Please enter the color from the item: " + index);
            color = keyboard.nextLine();
            System.out.println("Please enter the energy consumption from the item (A, B, C, D, E, F): " + index);
            consumoEnergetico = keyboard.nextLine();
            System.out.println("Please enter the weight from the item: " + index);
            peso = Double.parseDouble(keyboard.nextLine());

            electrodomesticos.add(new Electrodomestico(precio, peso, color, consumoEnergetico));
        }

        // Creamos 3 lavadoras
        System.out.println("********************************************************************");
        System.out.println("Por favor ingresa la información de las lavadoras...");
        System.out.println("********************************************************************");
        for (int index=1; index<4; index++){
            System.out.println("Please enter the price from the item: " + index);
            precio = Double.parseDouble(keyboard.nextLine());
            System.out.println("Please enter the color from the item: " + index);
            color = keyboard.nextLine();
            System.out.println("Please enter the energy consumption from the item (A, B, C, D, E, F): " + index);
            consumoEnergetico = keyboard.nextLine();
            System.out.println("Please enter the weight from the item: " + index);
            peso = Double.parseDouble(keyboard.nextLine());
            System.out.println("Please enter the load from the item: " + index);
            carga = Integer.parseInt(keyboard.nextLine());

            electrodomesticos.add(new Lavadora(carga, precio, peso, color, consumoEnergetico));
        }

        // Creamos 3 televisores
        System.out.println("********************************************************************");
        System.out.println("Por favor ingresa la información de los televisores...");
        System.out.println("********************************************************************");
        for (int index=1; index<4; index++){
            System.out.println("Please enter the price from the item: " + index);
            precio = Double.parseDouble(keyboard.nextLine());
            System.out.println("Please enter the color from the item: " + index);
            color = keyboard.nextLine();
            System.out.println("Please enter the energy consumption from the item (A, B, C, D, E, F): " + index);
            consumoEnergetico = keyboard.nextLine();
            System.out.println("Please enter the weight from the item: " + index);
            peso = Double.parseDouble(keyboard.nextLine());
            System.out.println("Please enter the resolution from the item: " + index);
            resolucion = Double.parseDouble(keyboard.nextLine());
            System.out.println("Does the television has sintonization (S/N): " + index);
            sintonizador = keyboard.nextLine();

            electrodomesticos.add(new Television(resolucion, sintonizador, precio, peso, color, consumoEnergetico));
        }

        for (Electrodomestico electrodomestico : electrodomesticos){
            electrodomestico.precioFinal();
        }

        for (Electrodomestico electrodomestico : electrodomesticos){
            System.out.println(electrodomestico);
        }
    }
}

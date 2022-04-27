package com.sofkau.exercise17.models;

import com.sofkau.exercise17.interfaces.IElectrodomestico;


public class Electrodomestico implements IElectrodomestico {
    protected Double precioBase;
    protected Double precioFinal;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    // Constructores

    public Electrodomestico() {
        this.color = "Blanco";
        this.consumoEnergetico = "F";
        this.precioBase = 100.0;
        this.peso = 5.0;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = "F";
    }

    public Electrodomestico(Double precioBase, Double peso, String color, String consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color) ? color : "Blanco";
        this.consumoEnergetico = comprobarConsumo(consumoEnergetico) ? consumoEnergetico.toUpperCase() : "F";
    }

    private Boolean comprobarConsumo(String letra) {
        String validLetters = "ABCDEF";
        String upperLetter = letra.toUpperCase();
        return validLetters.contains(upperLetter);
    }

    private Boolean comprobarColor(String color) {
        Boolean isColorOk = false;
        String coloresDisponibles[] = new String[5];
        coloresDisponibles[0] = "blanco";
        coloresDisponibles[1] = "negro";
        coloresDisponibles[2] = "rojo";
        coloresDisponibles[3] = "azul";
        coloresDisponibles[4] = "gris";

        for (String cadena : coloresDisponibles) {
            isColorOk = cadena == color ? true : false;
        }
        return isColorOk;
    }

    public void precioFinal() {
        this.precioFinal = this.precioBase + sumaPrecioConsumo() + sumaPrecioTamanio();
    }

    private double sumaPrecioConsumo() {
        Double valorAdicional = 0.0;
        switch (this.consumoEnergetico) {
            case "A":
                valorAdicional = 100.0;
                break;
            case "B":
                valorAdicional = 80.0;
                break;
            case "C":
                valorAdicional = 60.0;
                break;
            case "D":
                valorAdicional = 50.0;
                break;
            case "E":
                valorAdicional = 30.0;
                break;
            case "F":
                valorAdicional = 10.0;
                break;
        }
        return valorAdicional;
    }

    private double sumaPrecioTamanio() {
        Double valorAdicional = 0.0;
        if (this.peso >= 0.0 && this.peso <= 19.0) {
            valorAdicional = 10.0;
        } else if (this.peso >= 20.0 && this.peso <= 49.0) {
            valorAdicional = 50.0;
        } else if (this.peso >= 50.0 && this.peso <= 79.0) {
            valorAdicional = 80.0;
        } else if (this.peso >= 80.0) {
            valorAdicional = 100.0;
        }
        return valorAdicional;
    }

    // Getters

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "PrecioBase: " + precioBase + "\n" +
                "PrecioFinal: " + precioFinal + "\n" +
                "Color: " + precioBase + "\n" +
                "ConsumoEnergetico: " + consumoEnergetico + "\n" +
                "Peso: " + peso + "\n";
    }
}

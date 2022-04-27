package com.sofkau.exercise17.models;

public class Television extends Electrodomestico {
    protected Double  resolucion;
    protected Boolean sintonizador = false;


    public Television() {
        super();
        this.resolucion = 20.0;
        this.sintonizador = false;
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.resolucion = 20.0;
        this.sintonizador = false;
    }

    public Television(Double resolucion, String sintonizador, Double precioBase, Double peso, String color, String consumoEnergetico) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = validarSintonizador(sintonizador);
    }

    public Boolean validarSintonizador(String sintonizador) {
        String upperLetter = sintonizador.toUpperCase();
        return upperLetter.equals("S") ? true : false;
    }

    @Override
    public void precioFinal() {
        Double tempPrice = this.precioBase;
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precioFinal += tempPrice * 0.3;
        }
        if (this.sintonizador) {
            this.precioFinal += 50;
        }
    }

    @Override
    public String toString() {
        return "PrecioBase: " + precioBase + "\n" +
                "PrecioFinal: " + precioFinal + "\n" +
                "Color: " + precioBase + "\n" +
                "ConsumoEnergetico: " + consumoEnergetico + "\n" +
                "Peso: " + peso + "\n" +
                "Resolucion: " + resolucion + "\n" +
                "Sintonizador : " + sintonizador + "\n";
    }
}

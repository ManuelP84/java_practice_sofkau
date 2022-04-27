package com.sofkau.exercise17.models;

public class Lavadora extends Electrodomestico {
    private final Integer CARGA = 5;
    private       Integer carga = CARGA;

    public Lavadora() {
        super();
        this.carga = CARGA;
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(Integer carga, Double precioBase, Double peso, String color, String consumoEnergetico) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return this.carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
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
                "Carga: " + carga + "\n";
    }
}

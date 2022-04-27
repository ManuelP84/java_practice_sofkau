package com.sofkau.exercise18.models;

import com.sofkau.exercise18.interfaces.Entregable;

public class Videojuego implements Entregable {
    protected String titulo;
    protected Integer horasEstimadas;
    protected Boolean entregado;
    protected String genero;
    protected String compañia;

    public Videojuego(){
        this.horasEstimadas = 10;
        this.entregado = false;
        this.titulo = "";
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, Integer horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compañia = "";
        this.entregado = false;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return  "Titulo : " + titulo + "\n" +
                "Horas estimadas : " + horasEstimadas + "\n" +
                "Entregado : " + entregado + "\n" +
                "Genero : " + genero + "\n" +
                "Compañia: " + compañia + "\n";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }
    @Override
    public Integer compareTo(Object object) {
        Videojuego videojuagoComparado = (Videojuego) object;
                Integer compareNumber = 0;
        if (this.horasEstimadas > videojuagoComparado.horasEstimadas)
            compareNumber = 1;
        if (this.horasEstimadas < videojuagoComparado.horasEstimadas)
            compareNumber = -1;
        return compareNumber;
    }
}

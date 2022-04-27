package com.sofkau.exercise18.main;

import com.sofkau.exercise18.models.Serie;
import com.sofkau.exercise18.models.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrelo total de series
        Serie series[] = crearSeries();
        // Arrelo total de videojuegos
        Videojuego videojuegos[] = crearVideojuegos();

        // Array de series entregadas
        List<Serie> seriesEntregadas;
        // Array de videojuegos entregados
        List<Videojuego> videojuegosEntregados;

        // Entrega de algunos videojuegos
        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();

        // Entrega de algunas series
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();
        series[4].entregar();

        // Seleccionamos las series entregadas
        seriesEntregadas = contarSeriesEntregadas(series);
        // Seleccionamos los videojuegos entregados
        videojuegosEntregados = contarVideojuegosEntregados(videojuegos);

        // Mostramos las series entregadas
        for (Serie serie : seriesEntregadas){
            System.out.println(serie);
        }

        // Mostramos los videojuegos entregados
        for (Videojuego videojuego : videojuegosEntregados){
            System.out.println(videojuego);
        }
    }

    public static Videojuego[] crearVideojuegos(){
        Videojuego videojuegos[] = new Videojuego[5];

        videojuegos[0] = new Videojuego("Mario Bros 3D", 10, "aventura", "Nintendo");
        videojuegos[1] = new Videojuego("Animal Crossing", 20, "acción", "Nintendo");
        videojuegos[2] = new Videojuego("Minecraft", 25, "aventura", "Nintendo");
        videojuegos[3] = new Videojuego("Kirby Star", 5, "aventurara", "Nintendo");
        videojuegos[4] = new Videojuego("Slaptoon 2", 35, "lucha", "Nintendo");

        return videojuegos;
    }

    public static Serie[] crearSeries(){
        Serie series[] = new Serie[5];

        series[0] = new Serie("Los 100", "Netflix", 7, "Suspenso");
        series[1] = new Serie("Vikingos", "Netflix", 6, "Drama");
        series[2] = new Serie("Flash", "Netflix", 8, "Accion");
        series[3] = new Serie("Stranger Things", "Netflix", 3, "Suspenso");
        series[4] = new Serie("Riverdale", "Netflix", 5, "Drama");

        return series;
    }

    public static List<Serie> contarSeriesEntregadas(Serie[] series){
        List<Serie>  seriesEntregadas = new ArrayList<Serie>();

        for(Serie serie : series){
            if(serie.isEntregado()){
                seriesEntregadas.add(serie);
            }
        }
        return seriesEntregadas;
    }

    public static List<Videojuego> contarVideojuegosEntregados(Videojuego[] videojuegos){
        List<Videojuego>  videojuegosEntregados = new ArrayList<Videojuego>();

        for(Videojuego videojuego : videojuegos){
            if(videojuego.isEntregado()){
                videojuegosEntregados.add(videojuego);
            }
        }
        return videojuegosEntregados;
    }
}

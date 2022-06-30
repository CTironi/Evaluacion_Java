package com.sofka.proyect.Ejercicio18;

public class Ejecutable {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Friends", "David Crane");
        series[1] = new Serie("Big Bang Theory", 12, "Comedia", "Chuck Lorre");
        series[2] = new Serie();
        series[3] = new Serie("Vikings", "Michael Hirst");
        series[4] = new Serie("Futurama", 7, "Comedia", "Matt Groening");

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Tetris", 15);
        videojuegos[2] = new Videojuego("League of Legends", 2);
        videojuegos[3] = new Videojuego("Final Fantasy", 500, "RPG", "Square Enix");
        videojuegos[4] = new Videojuego("Path of Exile", 200, "Action-RPG", "GGG");

        series[0].entregar();
        series[1].entregar();
        series[4].entregar();
        videojuegos[0].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        int cantVideojuegosEntregados = 0, cantSeriesEntregadas = 0;
        for (Videojuego e: videojuegos){
            if (e.isEntregado()){
                cantVideojuegosEntregados++;
                e.devolver();
            }
        }
        for (Serie s : series){
            if (s.isEntregado()){
                cantSeriesEntregadas++;
                s.devolver();
            }
        }

        System.out.println("Cantidad de series : "+ cantSeriesEntregadas);
        System.out.println("Cantidad de videjuegos : "+ cantVideojuegosEntregados);

        System.out.println(searchVideojuegoConMasHoras(videojuegos).toString());
    }
    public static Videojuego searchVideojuegoConMasHoras (Videojuego[] vs){
        Videojuego vConMasHoras = vs[0];

        for(Videojuego v : vs){
            if (v.getHoras_estimadas()> vConMasHoras.getHoras_estimadas()){
                vConMasHoras = v;
            }
        }
        return vConMasHoras;
    }
}

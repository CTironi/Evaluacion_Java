package com.sofka.proyect.Ejercicio18;

public class Videojuego implements Entregable {
    private String titulo = "";
    private int horas_estimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego(){}
    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }
    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horas_estimadas=" + horas_estimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' + "";
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object a) {
        Videojuego v = (Videojuego) a;
        return this.horas_estimadas==v.horas_estimadas ? 0 : this.horas_estimadas>v.horas_estimadas ? 1 : -1;
    }
}


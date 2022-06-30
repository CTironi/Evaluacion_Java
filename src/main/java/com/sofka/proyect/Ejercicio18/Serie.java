package com.sofka.proyect.Ejercicio18;

public class Serie implements Entregable {
    private String titulo = "";
    private int num_temporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie(){}
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    public Serie(String titulo, int num_temporadas, String genero, String creador){
        this.titulo = titulo;
        this.num_temporadas = num_temporadas;
        this.creador = creador;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNum_temporadas() {
        return num_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", num_temporadas=" + num_temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' + "";
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
        Serie s = (Serie)a;
        return this.num_temporadas==s.num_temporadas ? 0 : this.num_temporadas>s.num_temporadas ? 1 : -1;
    }
}

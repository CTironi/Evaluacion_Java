package com.sofka.proyect;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public static void main(String[] args) {

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:MM:SS");

        System.out.println(String.format("La fecha actual es: " + fecha.format(LocalDateTime.now()) + " y la hora es: " + hora.format(LocalDateTime.now())));

    }
}

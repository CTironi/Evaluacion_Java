package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            menu();
            numero = sc.nextInt();
            switch (numero) {
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 6:
                    continue;
                case 7:
                    continue;
                case 8:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("OPCION INCORRECTO.");
            }

        } while (numero != 8);
    }
    public static void menu(){
        System.out.println(
                "****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
}
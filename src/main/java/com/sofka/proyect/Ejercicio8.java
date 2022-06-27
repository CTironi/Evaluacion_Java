package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un dia de la semana: ");
        String dia = sc.nextLine();

        switch(dia){
            case "lunes":
                System.out.println("Día laboral.");
                break;
            case "martes":
                System.out.println("Día laboral.");
                break;
            case "miercoles":
                System.out.println("Día laboral.");
                break;
            case "jueves":
                System.out.println("Día laboral.");
                break;
            case "viernes":
                System.out.println("Día laboral.");
                break;
            case "sabado":
                System.out.println("Día no laboral.");
                break;
            case "domingo":
                System.out.println("Día no laboral.");
                break;
            default:
                System.out.println("Dia no valido.");
        }

    }
}

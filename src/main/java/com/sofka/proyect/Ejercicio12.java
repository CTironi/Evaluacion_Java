package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar palabra 1: ");
        String palabra1 = sc.nextLine();

        System.out.println("Ingresar palabra 2: ");
        String palabra2 = sc.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales.");
        }else{
            System.out.println("Las palabras son diferentes: "+palabra1 + " != "+palabra2);
        }

    }
}

package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Frase sin espacios: "+frase.replace(" ", ""));
    }
}

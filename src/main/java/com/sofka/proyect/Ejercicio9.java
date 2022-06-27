package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Texto con A: "+texto);

        String textoE = texto.replace("a", "e");
        System.out.println("Texto con E: "+textoE);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar una frase: ");
        String frase = sc.nextLine();

        System.out.println("Texto concatenado: "+textoE + " - "+frase);

    }
}

package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String texto = sc.nextLine();

        int vocales = 0;
        for (int x = 0; x < texto.length(); x++) {
            if ((texto.charAt(x) == 'a') || (texto.charAt(x) == 'e') || (texto.charAt(x) == 'i') || (texto.charAt(x) == 'o') || (texto.charAt(x) == 'u')) {
                vocales++;
            }
        }
        System.out.println("La longitud del texto es: " + texto.length() + " y contiene: " + vocales + " vocales");
    }
}





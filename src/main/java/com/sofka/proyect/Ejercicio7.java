package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;


        do {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
        }
        while (numero > 0);
        System.out.println("El numero es: "+numero);

    }
}

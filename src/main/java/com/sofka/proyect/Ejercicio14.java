package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar un numero: ");
        int nro = sc.nextInt();

        for (int i = nro; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }
}

package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar precio del producto:");
        Double precio = sc.nextDouble();
        int iva = 21;
        Double precioF = precio + (precio * iva)/100;

        System.out.println("El precio del producto + IVA es: "+precioF);
    }

}

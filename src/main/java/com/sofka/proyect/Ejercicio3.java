package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar radio del circulo");
        double radio = sc.nextDouble();
        double area = Math.pow(radio, 2) * Math.PI;

        System.out.println("El area del circulo es: "+area);


        }

    }


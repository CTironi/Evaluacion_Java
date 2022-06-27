package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nro A:");
        int nroA = sc.nextInt();
        System.out.println("Ingresar nro B:");
        int nroB = sc.nextInt();


        if(nroA == nroB){
            System.out.println("El valor de ambos numeros es igual: A=" + nroA + " y B=" + nroB );
        }else if (nroA > nroB){
            System.out.println("El valor de A es mayor que B: " + nroA);
        }else{
            System.out.println("El valor de B es mayor que A: " + nroB);
        }
    }
}

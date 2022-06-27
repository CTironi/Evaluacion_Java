package com.sofka.proyect;

public class Ejercicio1 {

    public static void main(String[] args) {
        int nroA = 5;
        int nroB = 6;

        if(nroA == nroB){
            System.out.println("El valor de ambos numeros es igual: A=" + nroA + " y B=" + nroB );
        }else if (nroA > nroB){
            System.out.println("El valor de A es mayor que B: " + nroA);
        }else{
            System.out.println("El valor de B es mayor que A: " + nroB);
        }
    }
}

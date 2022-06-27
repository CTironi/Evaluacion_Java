package com.sofka.proyect;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {

        ArrayList numerosP = new ArrayList();
        ArrayList numerosI = new ArrayList();


        for (int numero = 0; numero <= 100; numero++) {

            if ((numero % 2) != 0) {
                numerosI.add(numero);
            }
            else {
                numerosP.add(numero);
            }

        }
        System.out.println("Numeros Impar: "+numerosI);
        System.out.println("Numeros Par: "+numerosP);
    }
}

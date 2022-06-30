package com.sofka.proyect.Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void mensajeSegunPeso(int imc){
        if (imc == -1) System.out.println("Peso insuficiente");
        if(imc == 1) System.out.println("Peso ideal");
        if(imc == 0) System.out.println("Tiene sobrepeso");
    }
    public static void mensajeMayorDeEdad(boolean edad){
        if (edad) System.out.println("Mayor de edad");
        else System.out.println("Menor de edad");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);


        System.out.println("Ingresar nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingresar sexo Hombre o Mujer: ");
        String sexoA = entrada2.nextLine();
        char sexo = sexoA.charAt(0);
        System.out.println("Ingresar peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Ingresar altura: ");
        double altura = entrada.nextDouble();


        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        int imc = persona1.calcularIMC();
        mensajeSegunPeso(imc);
        mensajeMayorDeEdad(persona1.esMayorDeEdad());
        System.out.println(persona1.toString());



        System.out.println("Ingresar nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.println("Ingresar edad: ");
        int edad2 = entrada.nextInt();
        System.out.println("Ingresar sexo Hombre O Mujer: ");
        String sexo2 = entrada2.nextLine();
        char sexoChar2 = sexo2.charAt(0);


        Persona persona2 = new Persona(nombre2,edad2,sexoChar2);
        int imc2 = persona2.calcularIMC();
        mensajeSegunPeso(imc2);
        mensajeMayorDeEdad(persona2.esMayorDeEdad());
        System.out.println(persona2.toString());



        Persona persona3 = new Persona();
        persona3.setNombre("Juanito");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(85.4);
        persona3.setAltura(1.76);



        int imc3 = persona3.calcularIMC();
        mensajeSegunPeso(imc3);
        mensajeMayorDeEdad(persona3.esMayorDeEdad());
        System.out.println(persona3.toString());


    }
}

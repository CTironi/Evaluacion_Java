package com.sofka.proyect.Ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public static final char hombre = 'H';
    public static final char mujer = 'M';
    public static final int peso_menor = -1;
    public static final int peso_ideal = 0;
    public static final int peso_sobrepeso = 1;


    public Persona() {
        this.DNI = generateDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generateDNI();

    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generateDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura,2));
        return (imc<20)? peso_menor:(imc>=20 && imc<=25)? peso_ideal:peso_sobrepeso;
    }

    public Boolean esMayorDeEdad(){
        int mayor = this.edad;
        return mayor >= 18;
    }
    private static char comprobarSexo(char sexo){
        return sexo == hombre || sexo == mujer? sexo: hombre;
    }


    public String toString() {
        return  "\n"+
                "------INFORMACION----- "+ "\n"+
                "nombre = " + this.nombre + "\n" +
                "edad = " + this.edad + "\n"+
                "dni = " + this.DNI + "\n"+
                "sexo = " + this.sexo + "\n"+
                "peso = " + this.peso +"\n"+
                "altura = " + this.altura + "";

    }


    public int generateNumeroDNI(){
        double dni = 10000000 + Math.random() * 90000000;
        return (int)dni;
    }

    public char generateLetra(int nmero) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = nmero%23;
        return caracteres.charAt(resto);
    }

    public String generateDNI(){
        int numero = generateNumeroDNI();
        String serie = String.valueOf(generateLetra(numero));
        return serie + numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
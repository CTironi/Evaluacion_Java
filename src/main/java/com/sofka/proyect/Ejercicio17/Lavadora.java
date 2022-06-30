package com.sofka.proyect.Ejercicio17;

public class Lavadora extends Electrodomestico{

    final static int cargaPorDefecto=5;
    private int carga = cargaPorDefecto;


    public Lavadora(){

    }

    public Lavadora(double precio, double peso, int carga) {
        super(precio, peso);
        this.carga = cargaPorDefecto;
    }

    public Lavadora(double precio_base, String color, char consumo_energetico, double peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }


    public double precioFinal(){
        double total=0;
        if(carga>30){

            total = super.precioFinal(this.getConsumo_energetico(), this.getPeso())+50;
        }
        return total;
    }
}
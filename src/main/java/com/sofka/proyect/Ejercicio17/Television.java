package com.sofka.proyect.Ejercicio17;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;


    public Television(){

    }

    public Television(double peso, double precio){
        super(precio,peso);
    }

    public Television(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(double precio, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(double precio_base, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    private double precioFinal(){
        double precioFinal=0;
        if(this.resolucion>40){
            precioFinal = this.getPrecio_base() + (this.getPrecio_base()*30)/100;

        }
        if(isSintonizadorTDT()){
            precioFinal=precioFinal+50;
        }
        return precioFinal;
    }
}

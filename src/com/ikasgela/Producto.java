package com.ikasgela;

public class Producto {
    private String referencia;
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String referencia, String nombre, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters and Setters

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-25s | %-5.2f\n", referencia, nombre, precio);
    }
}

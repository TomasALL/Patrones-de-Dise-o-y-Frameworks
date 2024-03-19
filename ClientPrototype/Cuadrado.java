package com.mycompany.clientprototype;

public class Cuadrado implements Figura {
    private String nombre;
    private String color;
    private double lado;

    public Cuadrado() {}

    // Metodos para establecer y obtener el nombre
    @Override
    public void setNombre(String n) {
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    // Metodos para establecer y obtener el color
    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    // Metodo para clonar el cuadrado
    @Override
    public Figura clonar() {
        Figura figura = new Cuadrado();
        figura.setNombre(this.nombre);
        figura.setColor(this.color);
        return figura;
    }

    // Metodo para establecer y obtener el lado del cuadrado
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }
}

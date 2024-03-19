package com.mycompany.clientprototype;

public class ClientPrototype {

    public static void main(String[] args) {
        // Crear un circulo
        Circulo circulo1 = new Circulo();
        circulo1.setNombre("Circulo de sol");
        circulo1.setColor("Red");

        System.out.println("Circulo 1, nombre: " + circulo1.getNombre());
        System.out.println("Circulo 1, color: " + circulo1.getColor());
        System.out.println("");

        // Crear otro circulo
        Circulo circulo2 = new Circulo();
        circulo2.setNombre("Circulo de fuego");
        circulo2.setColor("Black");

        System.out.println("Circulo 2, nombre: " + circulo2.getNombre());
        System.out.println("Circulo 2, color: " + circulo2.getColor());
        System.out.println("");

        // Crear un triangulo
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setNombre("Equilátero");
        triangulo1.setColor("White");

        System.out.println("Triangulo 1, nombre: " + triangulo1.getNombre());
        System.out.println("Triangulo 1, color: " + triangulo1.getColor());
        System.out.println("");

        // Crear un cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setNombre("Cuadrado grande");
        cuadrado1.setColor("Blue");
        cuadrado1.setLado(5.0);

        System.out.println("Cuadrado 1, nombre: " + cuadrado1.getNombre());
        System.out.println("Cuadrado 1, color: " + cuadrado1.getColor());
        System.out.println("Cuadrado 1, lado: " + cuadrado1.getLado());
        System.out.println("");
    }
}

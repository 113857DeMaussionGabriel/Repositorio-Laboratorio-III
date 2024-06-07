package org.example;

import java.util.Scanner;

public class Jugador {
    String nombre;
    int vida;
    int puntosCorrectos;

    public Jugador() {
        this.nombre = "";
        this.vida = 5;
        this.puntosCorrectos = 0;
    }


    public void CargarNombre(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nIngrese su nombre: ");
        String nombre = input.nextLine();

        this.nombre = nombre;
    }
}

package org.example;

import java.util.Scanner;

public class Jugador
{
    public String nombre;
    public int vida;

    public Jugador (String Nombre, int Vida)
    {
        this.nombre = Nombre;
        this.vida = Vida;
    }



    // metodos
    public String AdivinarLetra()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese la letra: ");
        String entrada = input.next();

        return entrada;
    }
}

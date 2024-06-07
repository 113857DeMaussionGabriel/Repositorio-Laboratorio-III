package org.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] palabras = {"hola","chau","hambre","casa","cosas","programar","prueba","simulacro"};

        int random = new Random().nextInt(palabras.length);

        Partida partida = new Partida(palabras[random]);

        partida.IniciarPartida();

    }
}

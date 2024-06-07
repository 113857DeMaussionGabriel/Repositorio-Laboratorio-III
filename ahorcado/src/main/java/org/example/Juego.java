package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego
{
    String[] palabras = {"hola", "tecnicatura", "sistema", "casilla"};
    Jugador usuario;
    List<String> letras = new ArrayList<String>();
    String palabra;

    public Juego ()
    {
        usuario = crearJugador();
    }


    // Metodo
    public Jugador crearJugador()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese el nombre del jugador: ");
        String nombre = input.next();
        System.out.println("\nIngrese la vida del jugador: ");
        int vida = input.nextInt();

        Jugador j = new Jugador(nombre, vida);

        return j;
    }

    public void IniciarParida()
    {
        int indice = (int)(Math.random() * (palabras.length + 1) + 1) + 1;

        palabra = palabras[indice];
        System.out.println("la palabra es: " + palabra);

        while (usuario.vida > 0 || palabra.length() > 0)
        {

            String letra = usuario.AdivinarLetra();
            letras.add(letra);
            if (palabra.contains(letra))
            {
                System.out.println("i se encontro la letra " + letra);

            }
            else
            {
                System.out.println("no se encontro la letra " + letra);
                usuario.vida--;
            }

            System.out.println("Ya se intento con las letras: ");
            for (int i = 0; i < letras.size(); i++)
            {
                System.out.print(letras.get(i));
            }


        }
    }


}

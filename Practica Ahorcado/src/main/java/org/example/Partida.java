package org.example;

import java.util.Scanner;

public class Partida {
    Jugador jugador;
    String palabraSecreta;
    StringBuilder palabraMuestra;
    String letras;

    //Constructor
    public Partida(String palabraSecreta) {
        this.jugador = new Jugador();
        jugador.CargarNombre();
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraMuestra = new StringBuilder(palabraSecreta.replaceAll(".", "_"));
        this.letras = "";
    }


    //Metodos
    public void IniciarPartida(){


        while (jugador.vida > 0){
            System.out.println( "\n\n\n----------------------------------------------------" +
                                "\nDatos ocultos" +
                                "\nPalabra Secreta: " + palabraSecreta +
                                "\nLetras adivinadas: " + letras);

            System.out.println( "\n\nPalabra: " + palabraMuestra +
                                "\nVidas: " + jugador.vida);

            String letra = PreguntarLetra();
            BuscarLetra(letra);
            if (palabraMuestra.toString().equals(palabraSecreta)){
                break;
            }

        }
        TerminarPartida();

    }

    public String PreguntarLetra(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese una letra para adivinar:");
        String entrada = input.nextLine().toUpperCase();
        String letra = entrada.charAt(0)+"";

        while (letras.contains(letra)){
            System.out.println("Ya dijo esa letra para adivinar. Ingrese otra:");
            letra = input.nextLine().toUpperCase();
        }
        letras += letra + " ";

        return letra;
    }

    public void BuscarLetra(String letra){
        boolean encontrado = false;
        for (int i = 0; i < palabraSecreta.length(); i++){

            if (palabraSecreta.charAt(i) == letra.charAt(0)){
                System.out.println("Se encontro la letra " + letra.charAt(0) + " en la posicion: " + i);
                palabraMuestra.setCharAt(i, letra.charAt(0));
                jugador.puntosCorrectos++;
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro la letra " + letra.charAt(0));
            jugador.vida--;
        }
    }

    public void TerminarPartida(){
        if (jugador.vida == 0){
            System.out.println("\nPartida Terminada (Se quedo sin vidas)");
        }else {
            System.out.println("\nPartida Terminada (Gano el juego)");
        }

        int puntuacion = (jugador.puntosCorrectos * 100) / palabraSecreta.length();
        System.out.println("Puntuacion (1 - 100) = " + puntuacion);
    }


}

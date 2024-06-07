package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    //Atributos
    String nombre;
    List<Carta> cartas;
    List<List<Carta>> puntos;

    //Constructor
    public Jugador(){
        nombre = "Usuario";
        cartas = new ArrayList();
        puntos = new ArrayList();
    }

    public Jugador(String nombre){
        this.nombre = nombre;
        cartas = new ArrayList();
        puntos = new ArrayList();
    }

    //Metodos
    public int JugarCarta(){
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea realizar? (1. Sumar 15, 2. Dejar Carta)");
        int opcion = input.nextInt();

        return opcion;
    }

    public void JugarCartaBot(){
        //Todo
    }

    public List<Carta> Sumar15(List<Carta> tablero){
        Scanner input = new Scanner(System.in);

        List<Carta> suma = new ArrayList();
        System.out.println("Que carta desea usar: ");
        int opcion = input.nextInt() - 1;

        suma.add(cartas.get(opcion));
        int total = CalcularTotal(suma);

        while (total < 15){
            System.out.println("Con que carta desea combinar: ");
            int numero = input.nextInt() - 1;

            suma.add(tablero.get(numero));
            total = CalcularTotal(suma);
        }
        if(total == 15){
            System.out.println("Eleccion correcta");
            cartas.remove(suma.get(0));
            Sumar15(suma);
        }else {
            System.out.println("Eleccion incorrecta");
        }



    }

    public void DejarCarta(){

    }

    public void MostrarCartas(){
        System.out.println( "\nCartas de " + nombre);
        for(int i = 0; i < cartas.size(); i++){
            Carta carta = cartas.get(i);
            System.out.println("\nCarta N#" + (i+1) + ":");
            System.out.println("Valor:" + carta.valor);
            System.out.println("Tipo:" + carta.tipo);
        }
    }


    public int CalcularTotal(List<Carta> c){
        int total = 0;
        for(int i = 0; i < c.size(); i++){
            total += c.get(i).valor;
        }
        return total;
    }



}

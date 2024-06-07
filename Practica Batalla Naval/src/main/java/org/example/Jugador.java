package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    //Atributos
    String nombre;
    List<Barco> barcos;
    Tablero tablero;


    //Constructor
    public Jugador(String nombre, List<Barco> barcos, Tablero tablero) {
        this.nombre = nombre;
        this.barcos = barcos;
        this.tablero = tablero;
    }

    public Jugador(){
        this.nombre = "JugadorX";
        this.barcos = new ArrayList<Barco>();
        this.tablero = new Tablero();
    }

    //Metodos
    public void Disparar(JugadorVirtual j){
        System.out.println("Disparando " + nombre);

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la fila del barco: ");
        int fila = input.nextInt() - 1;
        // Validar numeros del 1 al length matriz
        System.out.println("Ingrese la columna del barco: ");
        int columna = input.nextInt() - 1;
        // Validar numeros del 1 al length matriz[0]

        int indice = BuscarBarco(j, fila, columna);

        if (indice != -1){
            System.out.println("\nBarco golpeado");
            Barco b = j.barcos.get(indice);
            b.vivo = false;
            j.tablero.EliminarBarco(b);
        }else {
            System.out.println("\nAgua!!");
            j.tablero.DisparoAgua(fila, columna);
        }


    }

    public void AgregarFlota(){
        while (barcos.size() < 5){
            System.out.println("\nAgregue su barco N#" + (barcos.size()+1));
            AgregarBarco();
        }
    }


    public void AgregarBarco(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la fila del barco: ");
        int fila = input.nextInt() - 1;
        // Validar numeros del 1 al length matriz
        System.out.println("Ingrese la columna del barco: ");
        int columna = input.nextInt() - 1;
        // Validar numeros del 1 al length matriz[0]

        Barco barco = new Barco(fila, columna);
        if(ValidarBarco(barco)){
            barcos.add(barco);
            tablero.AgregarBarco(barco);
        }else {
            System.out.println("Ya hay un barco en esa posicion!!");
        }
    }

    public boolean ValidarBarco(Barco b){
        for (int i = 0; i < barcos.size(); i++) {
            if(barcos.get(i).fila == b.fila && barcos.get(i).columna == b.columna){
                return false; //Si hay un barco en ese lugar
            }
        }
        return true; //Si no hay un barco en ese lugar
    }

    public int BuscarBarco(JugadorVirtual j, int fila, int columna){
        for (int i = 0; i < j.barcos.size(); i++) {
            if(j.barcos.get(i).fila == fila && j.barcos.get(i).columna == columna && j.barcos.get(i).vivo){
                return i;
            }
        }
        return -1;
    }



}

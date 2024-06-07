package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JugadorVirtual {
    //Atributos
    String nombre;
    List<Barco> barcos;
    Tablero tablero;


    //Constructor
    public JugadorVirtual(){
        this.nombre = "JugadorVirtual";
        this.barcos = new ArrayList<Barco>();
        this.tablero = new Tablero();
    }

    //Metodos
    public void Disparar(Jugador j){
        System.out.println("Disparando " + nombre);
        int fila = new Random().nextInt(10);
        int columna = new Random().nextInt(10);

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
            AgregarBarco();
        }
    }


    public void AgregarBarco(){
        int fila = new Random().nextInt(10);
        int columna = new Random().nextInt(10);

        Barco barco = new Barco(fila, columna);
        if(ValidarBarco(barco)){
            barcos.add(barco);
            tablero.AgregarBarco(barco);
        }


    }

    public boolean ValidarBarco(Barco b){
        for (int i = 0; i < barcos.size(); i++) {
            if(barcos.get(i).fila == b.fila && barcos.get(i).columna == b.columna){
                return false;
            }
        }
        return true;
    }

    public int BuscarBarco(Jugador j, int fila, int columna){
        for (int i = 0; i < j.barcos.size(); i++) {
            if(j.barcos.get(i).fila == fila && j.barcos.get(i).columna == columna && j.barcos.get(i).vivo){
                return i;
            }
        }
        return -1;
    }
}

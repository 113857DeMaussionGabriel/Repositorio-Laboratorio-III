package org.example;

public class Barco {
    int fila;
    int columna;
    boolean vivo;

    public Barco(int fila, int columna, boolean vivo) {
        this.fila = fila;
        this.columna = columna;
        this.vivo = vivo;
    }

    public Barco(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.vivo = true;
    }

    public void HundirBarco(){
        this.vivo = false;
    }

}

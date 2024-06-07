package org.example;

public class Tablero {
    String[][] matriz;

    String vacio = " ";
    String agua = "_";
    String barco = "o";
    String hundido = "x";

    public Tablero() {
        this.matriz = new String[10][10];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                this.matriz[f][c] = vacio;
            }
        }
    }

    public void AgregarBarco(Barco b){
        matriz[b.fila][b.columna] = barco;
    }

    public void EliminarBarco(Barco b){
        matriz[b.fila][b.columna] = hundido;
    }

    public void MostrarTablero(){
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.println("");
        }
    }

    public void DisparoAgua(int f, int c){
        matriz[f][c] = agua;
    }
}

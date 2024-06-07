package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Batalla Naval!" );

        Jugador j1 = new Jugador();
        JugadorVirtual j2 = new JugadorVirtual();
        j1.AgregarFlota();
        System.out.println("Tablero 1");
        j1.tablero.MostrarTablero();

        j2.AgregarFlota();
        System.out.println("Tablero 2");
        j2.tablero.MostrarTablero();

        while (true){
            System.out.println("Turno del jugador 1");
            j1.Disparar(j2);

            System.out.println("Turno del jugador 2");
            j2.Disparar(j1);


            System.out.println("Tablero 1");
            j1.tablero.MostrarTablero();

            System.out.println("Tablero 2");
            j2.tablero.MostrarTablero();
        }


    }
}

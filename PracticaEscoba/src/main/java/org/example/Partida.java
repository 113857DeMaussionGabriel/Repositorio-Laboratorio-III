package org.example;

import java.util.*;

public class Partida {
    //Atributos
    List<Jugador> jugadores;
    List<Carta> mazo;
    List<Carta> tablero;

    public List<Carta> GetTablero(){
        return tablero;
    }



    //Constructor
    public Partida() {
        jugadores = new ArrayList<Jugador>();
        mazo = new ArrayList<>();
        tablero = new ArrayList<>();
    }

    //Metodo
    public void AgregarJugador(Jugador j){
        jugadores.add(j);
    }

    public void CrearMazo(){
        mazo.clear();

        String[] tipo = {"Oro", "Basto", "Espada", "Copa"};
        for (int i = 1; i <= 10; i++){
            for (int t = 0; t < tipo.length; t++){
                Carta carta = new Carta(i, tipo[t]);
                mazo.add(carta);
            }
        }
        Collections.shuffle(mazo);
    }

    public void AgregarTablero(){
        tablero.clear();

        while (tablero.size() < 4 && !mazo.isEmpty()){

            tablero.add(mazo.remove(0));

//            int random = new Random().nextInt(mazo.size());
//            tablero.add(mazo.get(random));
//            mazo.remove(random);

        }
    }

    public void RepartirCartas(Jugador j){
        while (j.cartas.size() < 3){
            j.cartas.add(mazo.remove(0));
        }
    }

    public void IniciarPartida(){
        CargarJugadores();
        CrearMazo();

        for (int i = 0; i < jugadores.size(); i++){
            RepartirCartas(jugadores.get(i));
        }

        while (!mazo.isEmpty()){
            if (tablero.isEmpty()){
                AgregarTablero();
            }
            MostrarPartida();
            jugadores.get(0).MostrarCartas();
            int opcion = jugadores.get(0).JugarCarta();
            if (opcion == 1){
                jugadores.get(0).Sumar15(tablero);
            }

            jugadores.get(1).MostrarCartas();
            jugadores.get(1).JugarCartaBot();



        }

    }

    public void MostrarPartida(){
        System.out.println("\nTablero:");
        for (int i = 0; i < tablero.size(); i++){
            Carta carta = tablero.get(i);
            System.out.println("\nCarta N#" + (i+1) + ":");
            System.out.println("Valor:" + carta.valor);
            System.out.println("Tipo:" + carta.tipo);
        }
    }



    public void CargarJugadores(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        Jugador j1 = new Jugador(nombre);
        Jugador j2 = new Jugador("JugadorVirtual");

        jugadores.add(j1);
        jugadores.add(j2);
    }


    public void SumarPuntos(List<Carta> lSumar){
        for(int i = 1; i < lSumar.size(); i++){

        }
    }



}

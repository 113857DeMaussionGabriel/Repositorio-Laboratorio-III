package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {




    }


    public static void ArreglosUni()
    {
        // Arreglos unidimencionales[]
        int[] arregloUni = new int[3];
        // [0] [1] [2]
        arregloUni[0] = 10;
        arregloUni[1] = 20;
        arregloUni[2] = 30;


        for (int i = 0; i < arregloUni.length; i++)
        {
            System.out.println(arregloUni[i]);
        }



    }


    public static void ArreglosUni2()
    {
        String[] palabrasUni = {"hola ", "mundo", "!"};


        for (int i = 0; i < palabrasUni.length; i++)
        {
            System.out.print(palabrasUni[i]);
        }
    }


    public static void ArreglosBi()
    {
        int[][] matriz = new int[2][2];

        matriz[0][0] = 11;
        matriz[0][1] = 12;
        matriz[1][0] = 21;
        matriz[1][1] = 22;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

    }

    public static void Listas()
    {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Integer n : numeros)
        {
            System.out.println(n);
        }

    }

    public static  void Mapa()
    {
        Map<Integer, Object> mapa = new HashMap<>();

        // Clave y valor
        mapa.put(1, "valor 1");
        mapa.put(2, "valor b");
        //mapa.put(3, "valor c");
        mapa.put(4, "valor x");

        // Cantidad de items
        System.out.println("Size: " + mapa.size());




//        for (Integer n : mapa.keySet())
//        {
//            System.out.println(mapa.get(n));
//        }
//
//        for (int i = 0; i < mapa.size(); i++)
//        {
//            mapa.put(i, mapa.get(i));
//        }
    }


























}

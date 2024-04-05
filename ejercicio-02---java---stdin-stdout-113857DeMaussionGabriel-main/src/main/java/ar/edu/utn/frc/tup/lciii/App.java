package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Stdin & Stdout!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println("Ingrese:");
//        Scanner input = new Scanner(System.in);
//        String cadena = input.next();
//        String cadena2 = input.next();
//        String cadena3 = input.next();
//        String Total = cadena + " " + cadena2 + " " + cadena3;
//        //int numero = input.nextInt();
//        input.close();
//
//        //System.out.println("El primer numero que se introdujo fue: " + numero);
//        System.out.println("Primero: " + cadena);
//        System.out.println("Segundo: " + cadena2);
//        System.out.println("Tercero: " + cadena3);
//        System.out.println("Total: " + Total);


        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese 3 números distintos:");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        System.out.println("\nLos numeros que se agregaron son: \n" + numero1 + "\n" + numero2 + "\n" + numero3);






        System.out.println("\nCerrando programa...");
    }
}

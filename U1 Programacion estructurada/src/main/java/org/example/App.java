package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Variables
        Scanner input = new Scanner(System.in);
        int entrada = 1;

        //Menu
        while (entrada != 0)
        {
            System.out.println("\n\n\n=========================MENU=========================");
            System.out.println(" 1. Calcular: suma, diferencia, producto y cociente.");
            System.out.println(" 2. Calcular IVA.");
            System.out.println(" 3. Imprimir factura.");
            System.out.println(" 4. Informar persona mas alta.");
            System.out.println(" 5. Informar total a cobrar.");
            System.out.println(" 6. Informar si es año bisiesto.");
            System.out.println(" 7. Importe por uso de vehiculo.");
            System.out.println(" 8. Calcular suma y promedio.");
            System.out.println(" 9. Cantidad de números mayores a 5.");
            System.out.println("10. Validar numero positivo.");
            System.out.println("11. Tiempos F1.");
            System.out.println("12. Informe concesionaria de autos");
            System.out.println(" 0. Salir");
            System.out.println("======================================================");

            System.out.print("Entrada: ");
            entrada = input.nextInt();

            if (entrada == 1) { Ejercicio1(); }
            if (entrada == 2) { Ejercicio2(); }
            if (entrada == 3) { Ejercicio3(); }
            if (entrada == 4) { Ejercicio4(); }
            if (entrada == 5) { Ejercicio5(); }
            if (entrada == 6) { Ejercicio6(); }
            if (entrada == 7) { Ejercicio7(); }
            if (entrada == 8) { Ejercicio8(); }
            if (entrada == 9) { Ejercicio9(); }
            if (entrada == 10) { Ejercicio10(); }
            if (entrada == 11) { Ejercicio11(); }
            if (entrada == 12) { Ejercicio12(); }
            if (entrada == 0) { break; }
        }
        System.out.println("Cerrando programa...");
    }

    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio1()
    {
        System.out.println( "\nDeclarar dos variables enteras y cargar sus valores por teclado." +
                            "\nInformar su suma, diferencia, producto y cociente.\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int n1 = in.nextInt();

        System.out.print("Numero 1: ");
        int n2 = in.nextInt();

        System.out.println( "\nRESULTADO:" +
                            "\nSuma: " + (n1 + n2) +
                            "\nDiferencia: " + (n1 - n2) +
                            "\nProducto: " + (n1 * n2) +
                            "\nCociente: " + (n1 / n2));

        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio2()
    {
        System.out.println( "\nHacer un programa que ingrese el precio de un artículo a la venta y calcule el precio" +
                            "\ncon IVA.\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Precio del articulo: $");
        double precio = in.nextDouble();
        double iva = precio * 0.21;

        System.out.println( "\nRESULTADO:" +
                            "\nTotal: $" + (precio + iva) + " (21% IVA = $" + iva + ")");

        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio3()
    {
        System.out.println( "\nHacer un programa que ingrese los datos de una factura en la cual haya tres artículos" +
                            "\nvendidos. De cada artículo ingresar el precio unitario y la cantidad." +
                            "\nFinalmente imprimir el total de la factura.\n");

        Scanner in = new Scanner(System.in);

        E3Articulo[] lArticulos = new E3Articulo[3];
        for (int i = 0; i < lArticulos.length; i++)
        {
            String aNombre = "Articulo" + (i + 1);
            System.out.println("\n" + aNombre);

            System.out.print("precio:");
            double aPrecio = in.nextDouble();

            System.out.print("cantidad:");
            int aCantidad = in.nextInt();

            lArticulos[i] = new E3Articulo(aNombre, aPrecio, aCantidad);
        }

        double total = 0;
        System.out.println("\nFACTURA");
        for (E3Articulo a : lArticulos)
        {
            a.Mostrar();
            total += a.precio * a.cantidad;
        }
        System.out.println("Total = " + total);


        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio4()
    {
        System.out.println("Ingresar nombre y altura de dos personas, informar el nombre de la más alta.\n");

        Scanner in = new Scanner(System.in);

        E4Persona[] lPersonas = new E4Persona[2];
        for (int i = 0; i < lPersonas.length; i++)
        {
            System.out.println("\nIngrese los datos de la persona.");

            System.out.print("nombre:");
            String pNombre = in.nextLine();

            System.out.print("altura:");
            int pAltura = in.nextInt();
            lPersonas[i] = new E4Persona(pNombre, pAltura);
            in.nextLine();
        }

        int indice = 0;
        for (int j = 0; j < lPersonas.length; j++)
        {
            if (lPersonas[j].altura > lPersonas[indice].altura)
            {
                indice = j;
            }
        }

        System.out.println( "\nRESULTADO" +
                            "\nLa persona mas alta es: " + lPersonas[indice].nombre);


        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio5()
    {
        System.out.println( "\nIngresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora." +
                            "\nIndique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las" +
                            "\nexcedentes las cobra con un 50 % de aumento.\n");

        Scanner in = new Scanner(System.in);
        double total = 0;

        System.out.println("\nDatos del empleado");

        System.out.print("horas trabajadas:");
        int horas = in.nextInt();
        in.nextLine();

        System.out.print("sueldo por hora:");
        double sueldo = in.nextDouble();
        in.nextLine();

        if (horas > 180)
        {
            total = (180 * sueldo) + ((horas - 180) * (sueldo * 1.5));
        }
        else
        {
            total = (horas * sueldo);
        }

        System.out.println( "\nRESULTADO" +
                            "\nTotal a cobrar: $" + total);



        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio6()
    {
        System.out.println( "\nIngresar un año e indicar si ese año es bisiesto." +
                            "\nUn año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.\n");

        Scanner in = new Scanner(System.in);

        System.out.println("\nIngrese un año");
        System.out.print("año:");
        int año = in.nextInt();
        in.nextLine();

        System.out.println("\nRESULTADO");
        if (((año % 4) == 0 && (año % 100) != 0) || (año % 400) == 0)
        {
            System.out.println("Es bisiesto.");
        }
        else
        {
            System.out.println("No es bisiesto.");
        }


        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio7()
    {
        System.out.println( "\nUna empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario." +
                            "\nPor cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000" +
                            "\ncobra $10 adicionales. Hacer un programa que solicite la cantidad de km realizados" +
                            "\npor un cliente e indique el importe que se le debe cobrar.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio8()
    {
        System.out.println("Ingresar 10 números por teclado, informar su suma y promedio.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio9()
    {
        System.out.println( "\nIngresar un número n y a continuación n números positivos. Informar la cantidad de mayores" +
                            "\na 5 que se hayan ingresado.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio10()
    {
        System.out.println( "\nIngresar un número y validar que sea positivo." +
                            "\nSi no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio11()
    {
        System.out.println( "\nIngresar el tiempo en segundos que realizó el ganador de la clasificación de una carrera" +
                            "\nde F1. Luego ingresar los tiempos de los otros 9 corredores e informar cuántos disputarán" +
                            "\nla carrera." +
                            "\nPara que un corredor pueda participar su tiempo de clasificación no puede superar en 15%" +
                            "\nal del ganador.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    private static void Ejercicio12()
    {
        System.out.println( "\nDesarrollar un programa que permita ingresar la antigüedad los autos de una concesionaria de usados." +
                            "\nFinalizar la carga cuando se ingrese 0. Por cada auto ingresado mostrar por pantalla un mensaje" +
                            "\nadecuado con el siguiente criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”," +
                            "\nsi tiene entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de" +
                            "\n20 “MUY ANTIGUO”.\n");

        Scanner in = new Scanner(System.in);



        in.nextLine();
        System.out.print("\nPresione [Enter] para continuar...");
        String stop = in.nextLine();
    }
    //------------------------------------------------------------------------------------------------------------------

}

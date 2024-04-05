package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int numero = 128;
        boolean flag = true;
        String cadena = "Hola";
        String cadena2 = "Mundo";


        System.out.println( "Hello World!" );



        if (cadena.contains("h"))
        {
            System.out.println(cadena + " " + cadena2 + "!");
            System.out.println("Condicional Si");
        }
        else
        {
            System.out.println("Condicional No");
        }


        if(flag)
        {
            System.out.println("Bool True");
        }


        String mayus;

        mayus = cadena.toUpperCase();

        if (mayus.contains("A"))
        {
            System.out.println(mayus);
            System.out.println("Condicional Si en Mayus");
        }

        String CadenaConcatenada = cadena.concat(" " + cadena2 + " (Concatenada)");
        System.out.println(CadenaConcatenada);

        char letra = CadenaConcatenada.charAt(2);

        System.out.println("La letra en -segundo- TERCER lugar de la cadena concatenada es: " + letra);
        System.out.println("(Tener en cuenta que los indices empiezan en 0, no en 1)");

        int i = 0;
        boolean bCiclo = false;

        System.out.println("\nDeletreo de cadena concatenada:\n");

        while (i < CadenaConcatenada.length() && bCiclo == false)
        {
            if("(".equals(CadenaConcatenada.charAt(i)))
            {
                bCiclo = true;
            }
            System.out.println(CadenaConcatenada.charAt(i));
            i++;
        }



    }
}

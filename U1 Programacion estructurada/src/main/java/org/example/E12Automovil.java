package org.example;

public class E12Automovil
{
    private int antiguedad;

    public E12Automovil(int Antiguedad)
    {
        this.antiguedad = Antiguedad;
    }

    public void MostrarAntiguedad()
    {
        System.out.println("\nRESULTADO:");
        if( antiguedad > 20)
        {
            System.out.println("MUY ANTIGUO");
        } else if (antiguedad > 10)
        {
            System.out.println("MUCHO USO");
        } else if (antiguedad > 5)
        {
            System.out.println("POCO USO");
        } else if (antiguedad > 0)
        {
            System.out.println("NUEVO");
        }

    }




}

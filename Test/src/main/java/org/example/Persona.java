package org.example;

public class Persona
{
    private String nombre;

    private String apellido;
    private int edad;


    public Persona(String Nombre, String Apellido, int Edad)
    {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.edad = Edad;
    }

    public String NombreCompleto()
    {
        String nombreC = nombre + "" + apellido;
        return nombreC;
    }

}

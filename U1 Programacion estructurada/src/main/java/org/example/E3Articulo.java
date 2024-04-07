package org.example;

public class E3Articulo
{
    //Atributos
    String nombre;
    double precio;
    int cantidad;

    //Constructor
    public E3Articulo(String Nombre, double Precio, int Cantidad)
    {
        this.nombre = Nombre;
        this.precio = Precio;
        this.cantidad = Cantidad;
    }

    public void Mostrar()
    {
        System.out.println(nombre + " = $" + (precio * cantidad) + "(" + precio + " x " + cantidad + ")");
    }


}

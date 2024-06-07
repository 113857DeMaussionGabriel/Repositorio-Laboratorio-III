package com.example.Ejemplo.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity //Transforma una clase en una tabla
@Table(name = "Personas") //Define el nombre de la base de datos
@Data
public class Persona {



    @Id//PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name") //Lo que este entre las comillas define el nombre en DB
    private String nombre;

    @Column(name = "last_name")
    private String apellido;

    @Column(name = "age")
    private int edad;


}

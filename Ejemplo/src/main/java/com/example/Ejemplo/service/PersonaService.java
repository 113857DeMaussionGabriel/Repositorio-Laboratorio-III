package com.example.Ejemplo.service;

import com.example.Ejemplo.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    Persona InsertarPersona(Persona persona);
    List<Persona> BuscarTodos();
    Persona BuscarPersona(String nombre);
    Optional<Persona> BuscarPersona(Long id);
    void BorrarPersona(Long id);
    Persona ActualizarPersona(Long id, Persona persona);
}

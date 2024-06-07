package com.example.Ejemplo.repository;

import com.example.Ejemplo.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> { //Se crea un select, insert, update y delete con esto solo
    Persona findByNombre(String nombre);
    Optional<Persona> findById(Long id);
}

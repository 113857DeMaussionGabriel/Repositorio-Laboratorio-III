package com.example.Ejemplo.service.impl;

import com.example.Ejemplo.domain.Persona;
import com.example.Ejemplo.repository.PersonaRepository;
import com.example.Ejemplo.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceimpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceimpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    @Override
    public Persona InsertarPersona(Persona persona) {
        return personaRepository.save(persona); //Devuelve el objeto que se creo en la tabla
    }

    @Override
    public List<Persona> BuscarTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Persona BuscarPersona(String nombre) {
        return personaRepository.findByNombre(nombre);
    }

    @Override
    public Optional<Persona> BuscarPersona(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public void BorrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona ActualizarPersona(Long id, Persona persona) {
        Optional<Persona> base = personaRepository.findById(id);

        if (base.isPresent()) {
            Persona personaUpdate = base.get();
            personaUpdate.setNombre(persona.getNombre());
            personaUpdate.setApellido(persona.getApellido());
            personaUpdate.setEdad(persona.getEdad());
            return personaRepository.save(personaUpdate);
        }
        return null;
    }

}

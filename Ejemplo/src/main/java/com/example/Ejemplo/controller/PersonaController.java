package com.example.Ejemplo.controller;


import com.example.Ejemplo.domain.Persona;
import com.example.Ejemplo.repository.PersonaRepository;
import com.example.Ejemplo.service.PersonaService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class PersonaController {
    private final PersonaService personaService;
    private final PersonaRepository personaRepository;

    public PersonaController(PersonaService personaService, PersonaRepository personaRepository) {
        this.personaService = personaService;
        this.personaRepository = personaRepository;
    }


    @PostMapping("/persona")
    public ResponseEntity<Persona> savePersona(Persona persona) {
        Persona result = personaService.InsertarPersona(persona);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(result);
    }


    @GetMapping("/persona/all")
    public ResponseEntity<List<Persona>> listarPersonas() {
        List<Persona> personas = personaService.BuscarTodos();
        return ResponseEntity.status(200).body(personas);
    }

    @GetMapping("/persona")
    public Persona findByNombre(@RequestParam("nombre") String nombre) {
        return personaRepository.findByNombre(nombre);
    }

    @DeleteMapping("/persona/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        personaService.BorrarPersona(id);
        return ResponseEntity.status(200).body(null);
    }

    @PutMapping("/persona")
    public ResponseEntity<Persona> updatePersona(Persona persona) {
        personaService.InsertarPersona(persona);
        return ResponseEntity.status(200).body(persona);
    }

}

package com.example.primerawebspringboot.service;

import com.example.primerawebspringboot.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> findAll();
    Persona findId(Long id);
    Persona createPersona(Persona persona);
    Persona updatePersona(Long id, Persona persona);
    void deletePersona(Long id);
    Long countPersonas();
}

package com.example.primerawebspringboot.service.impl;

import com.example.primerawebspringboot.entity.Persona;
import com.example.primerawebspringboot.repository.PersonaRepository;
import com.example.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findId(Long id) {
        return personaRepository.findById(id).orElse(null);

    }

    //my find id si no encuentra el id retorna nullo
    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);

    }

    @Override
    public Persona updatePersona(Long id, Persona persona) {
        Persona p = personaRepository.findById(id).orElse(null);
        if (p != null){
            p.setNombre(persona.getNombre());
            p.setEdad(persona.getEdad());
            return personaRepository.save(p);
        }
    return null;

        }



    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public Long countPersonas() {
        return personaRepository.count();
    }
}

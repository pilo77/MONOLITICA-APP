package com.example.primerawebspringboot;

import com.example.primerawebspringboot.entity.Persona;
import com.example.primerawebspringboot.repository.PersonaRepository;
import com.example.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

//CommandLineRunner se almacena como un pequeño bean
@SpringBootApplication
public class PrimeraWebSpringbootApplication {
     //Esta anotacion se encarga de inyectarlo

    @Autowired
    private PersonaService personaService;

    public static void main(String[] args) {
        SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
    }

/*
    @Override
    public void run(String... args) throws Exception {
        personaService.createPersona(new Persona(5L, "cata", 18));
        personaService.createPersona(new Persona(6L, "calina", 18));
        personaService.createPersona(new Persona(7L, "maira", 18));
        personaService.createPersona(new Persona(7L, "Sofiaaa", 18));

        //Mostramos el numero de personasa
        System.out.println("numero de personas de la tablas " + personaService.countPersonas());
        //Mostramos la lista de personas
        List<Persona> personas = personaService.findAll();
        personas.forEach(p -> System.out.println("nombre de la persona: "+ p.getNombre()) );
    }*/
}

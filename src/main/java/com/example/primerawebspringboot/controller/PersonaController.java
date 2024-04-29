package com.example.primerawebspringboot.controller;


import com.example.primerawebspringboot.entity.Persona;
import com.example.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    //La clase model se utiliza para tranferir objetos del controller al vista

    @GetMapping
    public String listarPersonas(Model model) {
        List<Persona> personas = personaService.findAll();
        model.addAttribute("personas", personas); //key -valor
        return "Listar";
    }


}

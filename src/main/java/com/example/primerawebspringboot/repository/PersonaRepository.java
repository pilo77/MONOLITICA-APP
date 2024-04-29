package com.example.primerawebspringboot.repository;

import com.example.primerawebspringboot.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//se crea interfaces
//va heredar de una clase de jpa repository

//Repository es un esteriotipo
//se registra automaticamente en la interfaz en el bean contenedor de spring como frijole y lo vamos a poder llamar atraves de otras clases
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}

//Interactua directamente con la base de datos

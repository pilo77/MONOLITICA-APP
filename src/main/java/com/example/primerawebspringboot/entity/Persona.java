package com.example.primerawebspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@Data
@AllArgsConstructor //Estas son anotaciones de lombok estas se encargan de generar lo getter y setter
@NoArgsConstructor
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private int edad;

}

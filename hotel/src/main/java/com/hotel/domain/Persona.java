package com.hotel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data  //Automaticamente crear los set y get
@Entity
@Table(name = "persona") //Con cual tabla mapeara el objeto
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String codigo;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String correo;

    public Persona() {
    }

    public Persona(Long idPersona, String codigo, String nombre, String primerApellido, String segundoApellido, String cedula, String correo) {
        this.idPersona = idPersona;
        this.codigo = codigo;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.correo = correo;
    }
}

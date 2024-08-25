package com.hotel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data  //Automaticamente crear los set y get
@Entity
@Table(name="empleado") //Con cual tabla mapeara el objeto
public class Empleado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    private boolean estadoTrabajo;
    private String cargo;
    
    @OneToOne
    @JoinColumn(name = "id_persona")
    Persona persona;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, boolean estadoTrabajo, String cargo, Persona persona) {
        this.idEmpleado = idEmpleado;
        this.estadoTrabajo = estadoTrabajo;
        this.cargo = cargo;
        this.persona = persona;
    }
}

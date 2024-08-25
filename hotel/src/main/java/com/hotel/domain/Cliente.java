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
@Table(name="cliente") //Con cual tabla mapeara el objeto
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    @OneToOne
    @JoinColumn(name = "id_persona")
    Persona persona;

    public Cliente() {
    }

    public Cliente(Long idCliente, Persona persona) {
        this.idCliente = idCliente;
        this.persona = persona;
    }
}

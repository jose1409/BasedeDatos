package com.hotel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data  //Automaticamente crear los set y get
@Entity 
@Table(name="direccion") //Con cual tabla mapeara el objeto
public class Direccion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;
    private String provincia;
    private String canton;
    private String distrito;
    private String direccionUno;
    
    @OneToOne(mappedBy = "direccion")
    private Hotel hotel;
    
    public Direccion() {
    }

    public Direccion(Long idDireccion, String provincia, String canton, String distrito, String direccionUno, Hotel hotel) {
        this.idDireccion = idDireccion;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.direccionUno = direccionUno;
        this.hotel = hotel;
    }
}
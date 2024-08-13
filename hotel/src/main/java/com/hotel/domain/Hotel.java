/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="hotel") //Con cual tabla mapeara el objeto
public class Hotel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHotel;
    private String nombre;
    private String telefono;
    private String correo;
    
    @OneToOne
    @JoinColumn(name = "id_direccion")
    Direccion direccion;

    public Hotel() {
    }

    public Hotel(Long idHotel, String nombre, String telefono, String correo, Direccion direccion) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    
}

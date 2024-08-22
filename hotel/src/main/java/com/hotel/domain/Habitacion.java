package com.hotel.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitacion")
    private int idHabitacion;

    @Column(name = "numero_habitacion", nullable = false)
    private String numeroHabitacion;

    @Column(name = "precio", nullable = false)
    private long precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "maxima_capacidad", nullable = false)
    private int maximaCapacidad;

    @Column(name = "id_hotel", nullable = false)
    private int idHotel;

    @Column(name = "estado_limpieza")
    private String estadoLimpieza;
}

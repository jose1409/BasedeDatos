package com.hotel.domain;

import jakarta.persistence.*;

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

    // Getters y Setters

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMaximaCapacidad() {
        return maximaCapacidad;
    }

    public void setMaximaCapacidad(int maximaCapacidad) {
        this.maximaCapacidad = maximaCapacidad;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getEstadoLimpieza() {
        return estadoLimpieza;
    }

    public void setEstadoLimpieza(String estadoLimpieza) {
        this.estadoLimpieza = estadoLimpieza;
    }
}

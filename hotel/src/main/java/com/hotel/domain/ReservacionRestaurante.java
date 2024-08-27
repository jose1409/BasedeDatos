package com.hotel.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import lombok.Data;

@Data
@Entity
@Table(name = "reservacion_restaurante")
public class ReservacionRestaurante implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion_restaurante")
    private Long idReservacionRestaurante;

    private Date fechaReservacion;
    private Time horaEntrada;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    public ReservacionRestaurante() {
    }

    public ReservacionRestaurante(Long idReservacionRestaurante, Date fechaReservacion, Time horaEntrada, Cliente cliente) {
        this.idReservacionRestaurante = idReservacionRestaurante;
        this.fechaReservacion = fechaReservacion;
        this.horaEntrada = horaEntrada;
        this.cliente = cliente;
    }
}

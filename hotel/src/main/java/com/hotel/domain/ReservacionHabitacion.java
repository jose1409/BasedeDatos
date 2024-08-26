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
import lombok.Data;

@Data
@Entity
@Table(name = "reservacion_habitacion")
public class ReservacionHabitacion implements Serializable {
    
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion_habitacion")
    private Long idReservacionHabitacion;

    private Date fechaEntrada;
    private Date fechaSalida;
    private String metodoPago;
    private float descuento;

    @ManyToOne
    @JoinColumn(name = "id_habitacion", nullable = false)
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_horario", nullable = false)
    private Horario horario;

    public ReservacionHabitacion() {
    }

    public ReservacionHabitacion(Long idReservacionHabitacion, Date fechaEntrada, Date fechaSalida, String metodoPago, float descuento, Habitacion habitacion, Cliente cliente, Horario horario) {
        this.idReservacionHabitacion = idReservacionHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.metodoPago = metodoPago;
        this.descuento = descuento;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.horario = horario;
    }
}

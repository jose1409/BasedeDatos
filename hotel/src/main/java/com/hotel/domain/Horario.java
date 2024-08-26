package com.hotel.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import lombok.Data;

@Data  //Automaticamente crear los set y get
@Entity
@Table(name = "horario")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorario;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "hora_apertura", nullable = false)
    private Time horaApertura;

    @Column(name = "hora_cierre", nullable = false)
    private Time horaCierre;

    public Horario() {
    }

    public Horario(Long idHorario, Date fecha, Time horaApertura, Time horaCierre) {
        this.idHorario = idHorario;
        this.fecha = fecha;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
}

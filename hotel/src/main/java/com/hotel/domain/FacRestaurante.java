package com.hotel.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "fac_restaurante")
public class FacRestaurante implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fac_restaurante")
    private Long idFacRestaurante;

    private String metodoPago;
    private float descuento;
    private float totalPagar;

    @ManyToOne
    @JoinColumn(name = "id_reservacion_restaurante", nullable = false)
    private ReservacionRestaurante reservacionRestaurante;
    
    @OneToMany(mappedBy = "facturaRestaurante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<PlatilloMultiple> platilloMultiple;

    public FacRestaurante() {
    }

    public FacRestaurante(Long idFacRestaurante, String metodoPago, float descuento, float totalPagar, ReservacionRestaurante reservacionRestaurante, List<PlatilloMultiple> platilloMultiple) {
        this.idFacRestaurante = idFacRestaurante;
        this.metodoPago = metodoPago;
        this.descuento = descuento;
        this.totalPagar = totalPagar;
        this.reservacionRestaurante = reservacionRestaurante;
        this.platilloMultiple = platilloMultiple;
    }
}

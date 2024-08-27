package com.hotel.domain;

import com.hotel.domain.FacRestaurante;
import com.hotel.domain.Platillo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Entity
@Table(name = "platillo_multiple")
public class PlatilloMultiple implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platillo_multiple")
    private Long idPlatilloMultiple;

    @ManyToOne
    @JoinColumn(name = "id_platillo", nullable = false)
    private Platillo platillo;

    @ManyToOne
    @JoinColumn(name = "id_factura_restaurante", nullable = false)
    private FacRestaurante facturaRestaurante;
}

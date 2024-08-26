package com.hotel.dao;

import com.hotel.domain.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioDAO extends JpaRepository<Servicio, Long> {
    
}

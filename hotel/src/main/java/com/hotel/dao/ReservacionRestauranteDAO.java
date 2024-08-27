package com.hotel.dao;

import com.hotel.domain.ReservacionRestaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservacionRestauranteDAO extends JpaRepository<ReservacionRestaurante, Long> {
    
}

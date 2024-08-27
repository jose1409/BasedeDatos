package com.hotel.dao;

import com.hotel.domain.FacRestaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacRestauranteDAO extends JpaRepository<FacRestaurante, Long> {
    
}

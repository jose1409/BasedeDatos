package com.hotel.dao;

import com.hotel.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteDAO extends JpaRepository<Restaurante, Long> {
    
}

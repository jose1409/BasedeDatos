package com.hotel.dao;

import com.hotel.domain.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatilloDAO extends JpaRepository<Platillo, Long> {
    
}

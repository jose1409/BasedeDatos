package com.hotel.dao;

import com.hotel.domain.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface DireccionDAO extends JpaRepository<Direccion, Long>{
    
}

package com.hotel.dao;

import com.hotel.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}

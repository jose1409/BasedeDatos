package com.hotel.dao;

import com.hotel.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
}

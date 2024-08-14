package com.hotel.dao;

import com.hotel.domain.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionDAO extends JpaRepository<Habitacion, Long> {
    
}

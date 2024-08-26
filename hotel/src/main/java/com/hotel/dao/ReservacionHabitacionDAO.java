package com.hotel.dao;

import com.hotel.domain.ReservacionHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservacionHabitacionDAO extends JpaRepository<ReservacionHabitacion, Long> {
    
}

package com.hotel.dao;

import com.hotel.domain.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioDAO extends JpaRepository<Horario, Long> {
    
}

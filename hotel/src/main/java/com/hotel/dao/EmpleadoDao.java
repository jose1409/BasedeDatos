package com.hotel.dao;

import com.hotel.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{
    
}

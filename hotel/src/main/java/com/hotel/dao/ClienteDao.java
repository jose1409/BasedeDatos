package com.hotel.dao;

import com.hotel.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Long>{
    
}

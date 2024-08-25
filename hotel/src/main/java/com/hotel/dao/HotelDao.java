package com.hotel.dao;

import com.hotel.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDAO extends JpaRepository<Hotel, Long>{
    
}

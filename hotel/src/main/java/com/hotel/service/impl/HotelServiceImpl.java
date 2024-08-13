/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service.impl;

import com.hotel.dao.HotelDao;
import com.hotel.domain.Hotel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class HotelServiceImpl {
    
    @Autowired
    private HotelDao hotelDao;
    
    @Transactional(readOnly = true)
    public List<Hotel> getHoteles(boolean activos) {
        var lista = hotelDao.findAll();
        return lista;
    }
    
    @Transactional(readOnly = true)
    public Hotel getHotel(Hotel hotel) {
        return hotelDao.findById(hotel.getIdHotel()).orElse(null);
    }
    
    @Transactional
    public void guardar(Hotel hotel) {
        hotelDao.save(hotel);
    }
    
    @Transactional
    public void eliminar(Hotel hotel) {
        hotelDao.delete(hotel);
    }
}

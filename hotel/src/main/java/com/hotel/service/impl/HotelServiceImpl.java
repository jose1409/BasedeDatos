package com.hotel.service.impl;

import com.hotel.domain.Hotel;
import com.hotel.service.HotelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hotel.dao.HotelDAO;

@Service
public class HotelServiceImpl implements HotelService{
    
    @Autowired
    private HotelDAO hotelDao;
    
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
    
    @Override
    public Hotel getById(Long id) {
        return hotelDao.findById(id).orElse(null);
    }
}

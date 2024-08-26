package com.hotel.service.impl;

import com.hotel.dao.ReservacionHabitacionDAO;
import com.hotel.domain.ReservacionHabitacion;
import com.hotel.service.ReservacionHabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionHabitacionServiceImpl implements ReservacionHabitacionService{
    
    @Autowired
    private ReservacionHabitacionDAO _ReservacionHabitacionDAO;
    
    @Override
    public List<ReservacionHabitacion> getReservacionHabitaciones() {
        var lista = _ReservacionHabitacionDAO.findAll();
        return lista;
    }

    @Override
    public ReservacionHabitacion getReservacionHabitacion(ReservacionHabitacion reservacionHabitacion) {
        return _ReservacionHabitacionDAO.findById(reservacionHabitacion.getIdReservacionHabitacion()).orElse(null);
    }

    @Override
    public void guardar(ReservacionHabitacion reservacionHabitacion) {
        _ReservacionHabitacionDAO.save(reservacionHabitacion);
    }

    @Override
    public void eliminar(ReservacionHabitacion reservacionHabitacion) {
        _ReservacionHabitacionDAO.delete(reservacionHabitacion);
    }

    @Override
    public ReservacionHabitacion getById(Long id) {
        return _ReservacionHabitacionDAO.findById(id).orElse(null);
    }
    
}

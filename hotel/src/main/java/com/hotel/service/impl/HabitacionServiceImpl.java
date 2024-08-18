package com.hotel.service.impl;

import com.hotel.dao.HabitacionDAO;
import com.hotel.domain.Habitacion;
import com.hotel.service.HabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionDAO habitacionDAO;

    @Override
    public Habitacion getHabitacion(Habitacion habitacion) {
        return new Habitacion();
    }

    @Override
    public void guardar(Habitacion habitacion) {
        habitacionDAO.save(habitacion);
    }

    @Override
    public void eliminar(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habitacion> getHabitaciones(boolean activos) {
        var lista = habitacionDAO.findAll();
        return lista;
    }
}

package com.hotel.service.impl;

import com.hotel.dao.ReservacionRestauranteDAO;
import com.hotel.domain.ReservacionRestaurante;
import com.hotel.service.ReservacionRestauranteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionRestauranteServiceImpl implements ReservacionRestauranteService{
    
    @Autowired
    private ReservacionRestauranteDAO _ReservacionRestauranteDAO;
    
    @Override
    public List<ReservacionRestaurante> getReservacionRestaurantes() {
        var lista = _ReservacionRestauranteDAO.findAll();
        return lista;
    }

    @Override
    public ReservacionRestaurante getReservacionRestaurante(ReservacionRestaurante reservacionRestaurante) {
        return _ReservacionRestauranteDAO.findById(reservacionRestaurante.getIdReservacionRestaurante()).orElse(null);
    }

    @Override
    public void guardar(ReservacionRestaurante reservacionRestaurante) {
        _ReservacionRestauranteDAO.save(reservacionRestaurante);
    }

    @Override
    public void eliminar(ReservacionRestaurante reservacionRestaurante) {
        _ReservacionRestauranteDAO.delete(reservacionRestaurante);
    }

    @Override
    public ReservacionRestaurante getById(Long id) {
        return _ReservacionRestauranteDAO.findById(id).orElse(null);
    }
    
}

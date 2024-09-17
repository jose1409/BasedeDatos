package com.hotel.service.impl;

import com.hotel.dao.RestauranteDAO;
import com.hotel.domain.Restaurante;
import com.hotel.service.RestauranteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl implements RestauranteService {

    @Autowired
    private RestauranteDAO restauranteDAO;

    @Override
    public Restaurante getRestaurante(Restaurante restaurante) {
        return restauranteDAO.findById(restaurante.getIdRestaurante()).orElse(null);
    }

    @Override
    public void guardar(Restaurante restaurante) {
        restauranteDAO.save(restaurante);
    }

    @Override
    public void eliminar(Restaurante restaurante) {
        restauranteDAO.delete(restaurante);
    }

    @Override
    public List<Restaurante> getRestaurantes(boolean activos) {
        var lista = restauranteDAO.findAll();
        return lista;
    }

    @Override
    public Restaurante getById(Long id) {
        return restauranteDAO.findById(id).orElse(null);
    }
    
    
}

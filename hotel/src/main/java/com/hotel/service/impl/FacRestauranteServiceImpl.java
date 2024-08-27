package com.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.FacRestauranteDAO;
import com.hotel.domain.FacRestaurante;
import com.hotel.service.FacRestauranteService;

@Service
public class FacRestauranteServiceImpl implements FacRestauranteService {

    @Autowired
    private FacRestauranteDAO _FacRestauranteDAO;

    @Override
    public List<FacRestaurante> getFacRestaurantes() {
        var lista = _FacRestauranteDAO.findAll();
        return lista;
    }

    @Override
    public FacRestaurante getFacRestaurante(FacRestaurante facRestaurante) {
        return _FacRestauranteDAO.findById(facRestaurante.getIdFacRestaurante()).orElse(null);
    }

    @Override
    public void guardar(FacRestaurante facRestaurante) {
        _FacRestauranteDAO.save(facRestaurante);
    }

    @Override
    public void eliminar(FacRestaurante facRestaurante) {
        _FacRestauranteDAO.delete(facRestaurante);
    }

    @Override
    public FacRestaurante getById(Long id) {
        return _FacRestauranteDAO.findById(id).orElse(null);
    }
}

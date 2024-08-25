package com.hotel.service.impl;

import com.hotel.dao.DireccionDao;
import com.hotel.domain.Direccion;
import com.hotel.service.DireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DireccionServiceImpl implements DireccionService{

    @Autowired
    private DireccionDao direccionDao;

    @Transactional(readOnly = true)
    public List<Direccion> getDirecciones() {
        var lista = direccionDao.findAll();
        return lista;
    }

    @Transactional(readOnly = true)
    public Direccion getDireccion(Direccion direccion) {
        return direccionDao.findById(direccion.getIdDireccion()).orElse(null);
    }

    @Transactional
    public void guardar(Direccion direccion) {
        direccionDao.save(direccion);
    }

    @Transactional
    public void eliminar(Direccion direccion) {
        direccionDao.delete(direccion);
    }
}

package com.hotel.service.impl;

import com.hotel.dao.DireccionDao;
import com.hotel.domain.Direccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DireccionServiceImpl {

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

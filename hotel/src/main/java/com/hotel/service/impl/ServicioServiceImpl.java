package com.hotel.service.impl;

import com.hotel.domain.Servicio;
import com.hotel.service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.ServicioDAO;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioDAO _ServicioDao;

    @Override
    public List<Servicio> getServicios() {
        var lista = _ServicioDao.findAll();
        return lista;
    }

    @Override
    public Servicio getServicio(Servicio servicio) {
        return _ServicioDao.findById(servicio.getIdServicio()).orElse(null);
    }

    @Override
    public void guardar(Servicio servicio) {
        _ServicioDao.save(servicio);
    }

    @Override
    public void eliminar(Servicio servicio) {
        _ServicioDao.delete(servicio);
    }

}

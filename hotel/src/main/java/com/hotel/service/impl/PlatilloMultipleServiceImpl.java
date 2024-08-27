package com.hotel.service.impl;

import com.hotel.dao.PlatilloMultipleDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.domain.PlatilloMultiple;
import com.hotel.service.PlatilloMultipleService;

@Service
public class PlatilloMultipleServiceImpl implements PlatilloMultipleService {

    @Autowired
    private PlatilloMultipleDAO _PlatilloMultipleDAO;

    @Override
    public List<PlatilloMultiple> getPlatilloMultiples() {
        var lista = _PlatilloMultipleDAO.findAll();
        return lista;
    }

    @Override
    public PlatilloMultiple getPlatilloMultiple(PlatilloMultiple platilloMultiple) {
        return _PlatilloMultipleDAO.findById(platilloMultiple.getIdPlatilloMultiple()).orElse(null);
    }

    @Override
    public void guardar(PlatilloMultiple platilloMultiple) {
        _PlatilloMultipleDAO.save(platilloMultiple);
    }

    @Override
    public void eliminar(PlatilloMultiple platilloMultiple) {
        _PlatilloMultipleDAO.delete(platilloMultiple);
    }

    @Override
    public PlatilloMultiple getById(Long id) {
        return _PlatilloMultipleDAO.findById(id).orElse(null);
    }

 
}

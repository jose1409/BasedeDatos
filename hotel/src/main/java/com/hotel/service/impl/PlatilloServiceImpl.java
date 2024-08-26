package com.hotel.service.impl;

import com.hotel.dao.PlatilloDAO;
import com.hotel.domain.Platillo;
import com.hotel.service.PlatilloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatilloServiceImpl implements PlatilloService{
    
    
    @Autowired
    private PlatilloDAO _PlatilloDao;
    
    @Override
    public List<Platillo> getPlatillos(boolean activos) {
        var lista = _PlatilloDao.findAll();
        return lista;
    }

    @Override
    public Platillo getPlatillo(Platillo platillo) {
        return _PlatilloDao.findById(platillo.getIdPlatillo()).orElse(null);
    }

    @Override
    public void guardar(Platillo platillo) {
        _PlatilloDao.save(platillo);
    }

    @Override
    public void eliminar(Platillo platillo) {
        _PlatilloDao.delete(platillo);
    }
    
}

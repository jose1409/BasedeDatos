package com.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.HorarioDAO;
import com.hotel.domain.Horario;
import com.hotel.service.HorarioService;

@Service
public class HorarioServiceImpl implements HorarioService {

    @Autowired
    private HorarioDAO _horarioDAO;

    @Override
    public List<Horario> getHorarios() {
        var lista = _horarioDAO.findAll();
        return lista;
    }

    @Override
    public Horario getHorario(Horario horario) {
        return _horarioDAO.findById(horario.getIdHorario()).orElse(null);
    }

    @Override
    public void guardar(Horario horario) {
        _horarioDAO.save(horario);
    }

    @Override
    public void eliminar(Horario horario) {
        _horarioDAO.delete(horario);
    }

    @Override
    public Horario getById(Long id) {
        return _horarioDAO.findById(id).orElse(null);
    }
}

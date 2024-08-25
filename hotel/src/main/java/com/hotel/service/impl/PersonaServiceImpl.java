package com.hotel.service.impl;

import com.hotel.domain.Persona;
import com.hotel.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.PersonaDAO;


@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDAO personaDao;

    @Override
    public List<Persona> getPersonas() {
        var lista = personaDao.findAll();
        return lista;
    }

    @Override
    public Persona getPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }

    @Override
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

}

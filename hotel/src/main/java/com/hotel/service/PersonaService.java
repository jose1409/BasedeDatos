package com.hotel.service;

import com.hotel.domain.Persona;
import java.util.List;


public interface PersonaService {
    
    
    // Se obtiene un listado de Personas en un List
    public List<Persona> getPersonas();

    // Se obtiene un Persona, a partir del id de un Persona
    public Persona getPersona(Persona persona);

    // Se inserta un nuevo Persona si el id del Persona esta vacío
    // Se actualiza un Persona si el id del Persona NO esta vacío
    public void guardar(Persona persona);

    // Se elimina el Persona que tiene el id pasado por parámetro
    public void eliminar(Persona persona);
}

package com.hotel.service;

import com.hotel.domain.FacRestaurante;
import java.util.List;

public interface FacRestauranteService {
    
    // Se obtiene un listado de FacRestaurantes en un List
    public List<FacRestaurante> getFacRestaurantes();

    // Se obtiene un FacRestaurante, a partir del id de un FacRestaurante
    public FacRestaurante getFacRestaurante(FacRestaurante facRestaurante);

    // Se inserta un nuevo FacRestaurante si el id del FacRestaurante esta vacío
    // Se actualiza un FacRestaurante si el id del FacRestaurante NO esta vacío
    public void guardar(FacRestaurante facRestaurante);
    
    // Se elimina el FacRestaurante que tiene el id pasado por parámetro
    public void eliminar(FacRestaurante facRestaurante);
    
    public FacRestaurante getById(Long id);
}

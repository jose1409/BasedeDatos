package com.hotel.service;

import com.hotel.domain.Restaurante;
import java.util.List;

public interface RestauranteService {
    
    // Se obtiene un listado de categorias en un List
    public List<Restaurante> getRestaurantes(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Restaurante getRestaurante(Restaurante restaurante);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Restaurante restaurante);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Restaurante restaurante);
    
    public Restaurante getById(Long id);
}

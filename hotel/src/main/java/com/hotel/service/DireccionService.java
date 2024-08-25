package com.hotel.service;

import com.hotel.domain.Direccion;
import java.util.List;

public interface DireccionService {
    
    // Se obtiene un listado de categorias en un List
    public List<Direccion> getDirecciones();

    // Se obtiene un Categoria, a partir del id de un categoria
    public Direccion getDireccion(Direccion direccion);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Direccion direccion);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Direccion direccion);
}

package com.hotel.service;

import com.hotel.domain.Platillo;
import java.util.List;

public interface PlatilloService {
    
    // Se obtiene un listado de categorias en un List
    public List<Platillo> getPlatillos(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Platillo getPlatillo(Platillo platillo);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Platillo platillo);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Platillo platillo);
}

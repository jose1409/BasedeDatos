package com.hotel.service;

import com.hotel.domain.PlatilloMultiple;
import java.util.List;

public interface PlatilloMultipleService {
    
    // Se obtiene un listado de PlatilloMultiples en un List
    public List<PlatilloMultiple> getPlatilloMultiples();

    // Se obtiene un PlatilloMultiple, a partir del id de un PlatilloMultiple
    public PlatilloMultiple getPlatilloMultiple(PlatilloMultiple platilloMultiple);

    // Se inserta un nuevo PlatilloMultiple si el id del PlatilloMultiple esta vacío
    // Se actualiza un PlatilloMultiple si el id del PlatilloMultiple NO esta vacío
    public void guardar(PlatilloMultiple platilloMultiple);
    
    // Se elimina el PlatilloMultiple que tiene el id pasado por parámetro
    public void eliminar(PlatilloMultiple platilloMultiple);
    
    public PlatilloMultiple getById(Long id);
}

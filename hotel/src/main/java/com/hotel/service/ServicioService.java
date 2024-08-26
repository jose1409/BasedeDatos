package com.hotel.service;

import com.hotel.domain.Servicio;
import java.util.List;

public interface ServicioService {
    
    // Se obtiene un listado de Servicios en un List
    public List<Servicio> getServicios();

    // Se obtiene un Servicio, a partir del id de un Servicio
    public Servicio getServicio(Servicio servicio);

    // Se inserta un nuevo Servicio si el id del Servicio esta vacío
    // Se actualiza un Servicio si el id del Servicio NO esta vacío
    public void guardar(Servicio servicio);

    // Se elimina el Servicio que tiene el id pasado por parámetro
    public void eliminar(Servicio servicio);
}

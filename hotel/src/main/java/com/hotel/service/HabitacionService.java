package com.hotel.service;

import com.hotel.domain.Habitacion;
import java.util.List;

public interface HabitacionService {
    
    // Se obtiene un listado de categorias en un List
    public List<Habitacion> getHabitaciones(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Habitacion getHabitacion(Habitacion habitacion);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Habitacion habitacion);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Habitacion habitacion);
    
    public Habitacion getById(Long id);
}

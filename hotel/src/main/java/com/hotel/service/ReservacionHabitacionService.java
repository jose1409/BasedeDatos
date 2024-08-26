package com.hotel.service;

import com.hotel.domain.ReservacionHabitacion;
import java.util.List;

public interface ReservacionHabitacionService {
    
    // Se obtiene un listado de ReservacionHabitacions en un List
    public List<ReservacionHabitacion> getReservacionHabitaciones();

    // Se obtiene un ReservacionHabitacion, a partir del id de un ReservacionHabitacion
    public ReservacionHabitacion getReservacionHabitacion(ReservacionHabitacion reservacionHabitacion);

    // Se inserta un nuevo ReservacionHabitacion si el id del ReservacionHabitacion esta vacío
    // Se actualiza un ReservacionHabitacion si el id del ReservacionHabitacion NO esta vacío
    public void guardar(ReservacionHabitacion reservacionHabitacion);
    
    // Se elimina el ReservacionHabitacion que tiene el id pasado por parámetro
    public void eliminar(ReservacionHabitacion reservacionHabitacion);
    
    public ReservacionHabitacion getById(Long id);
}

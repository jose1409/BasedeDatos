package com.hotel.service;

import com.hotel.domain.ReservacionRestaurante;
import java.util.List;

public interface ReservacionRestauranteService {
    
    // Se obtiene un listado de ReservacionRestaurantes en un List
    public List<ReservacionRestaurante> getReservacionRestaurantes();

    // Se obtiene un ReservacionRestaurante, a partir del id de un ReservacionRestaurante
    public ReservacionRestaurante getReservacionRestaurante(ReservacionRestaurante reservacionRestaurante);

    // Se inserta un nuevo ReservacionRestaurante si el id del ReservacionRestaurante esta vacío
    // Se actualiza un ReservacionRestaurante si el id del ReservacionRestaurante NO esta vacío
    public void guardar(ReservacionRestaurante reservacionRestaurante);
    
    // Se elimina el ReservacionRestaurante que tiene el id pasado por parámetro
    public void eliminar(ReservacionRestaurante reservacionRestaurante);
    
    public ReservacionRestaurante getById(Long id);
}

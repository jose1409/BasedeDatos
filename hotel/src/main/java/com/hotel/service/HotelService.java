package com.hotel.service;

import com.hotel.domain.Hotel;
import java.util.List;

public interface HotelService {

    // Se obtiene un listado de categorias en un List
    public List<Hotel> getHoteles(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Hotel getHotel(Hotel hotel);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Hotel hotel);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Hotel hotel);
}

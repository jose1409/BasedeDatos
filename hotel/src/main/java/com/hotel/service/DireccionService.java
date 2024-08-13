/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.domain.Direccion;
import java.util.List;

public interface DireccionService {
    
        // Se obtiene un listado de categorias en un List
    public List<Direccion> getHoteles(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Direccion getHotel(Direccion direccion);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void guardar(Direccion direccion);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void eliminar(Direccion direccion);
}

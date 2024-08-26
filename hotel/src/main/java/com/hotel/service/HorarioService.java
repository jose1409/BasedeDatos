package com.hotel.service;

import com.hotel.domain.Horario;
import java.util.List;

public interface HorarioService {
    
    // Se obtiene un listado de Horarios en un List
    public List<Horario> getHorarios();

    // Se obtiene un Horario, a partir del id de un Horario
    public Horario getHorario(Horario horario);

    // Se inserta un nuevo Horario si el id del Horario esta vacío
    // Se actualiza un Horario si el id del Horario NO esta vacío
    public void guardar(Horario horario);
    
    // Se elimina el Horario que tiene el id pasado por parámetro
    public void eliminar(Horario horario);
    
    public Horario getById(Long id);
}

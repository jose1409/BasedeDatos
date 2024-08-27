package com.hotel.service;

import com.hotel.domain.Empleado;
import java.util.List;


public interface EmpleadoService {
    
    // Se obtiene un listado de Empleados en un List
    public List<Empleado> getEmpleados();

    // Se obtiene un Empleado, a partir del id de un Empleado
    public Empleado getEmpleado(Empleado empleado);

    // Se inserta un nuevo Empleado si el id del Empleado esta vacío
    // Se actualiza un Empleado si el id del Empleado NO esta vacío
    public void guardar(Empleado empleado);

    // Se elimina el Empleado que tiene el id pasado por parámetro
    public void eliminar(Empleado empleado);
    
    public Empleado getById(Long idEmpleado);
}

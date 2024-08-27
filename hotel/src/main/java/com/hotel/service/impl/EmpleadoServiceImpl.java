package com.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.EmpleadoDAO;
import com.hotel.domain.Empleado;
import com.hotel.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDAO empleadoDAO;

    @Override
    public List<Empleado> getEmpleados() {
        var lista = empleadoDAO.findAll();
        return lista;
    }

    @Override
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDAO.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    public void guardar(Empleado empleado) {
        empleadoDAO.save(empleado);
    }

    @Override
    public void eliminar(Empleado empleado) {
        empleadoDAO.delete(empleado);
    }
    
    @Override
    public Empleado getById(Long idEmpleado){
        return empleadoDAO.findById(idEmpleado).orElse(null);
    }
}

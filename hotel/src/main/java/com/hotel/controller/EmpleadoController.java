package com.hotel.controller;

import com.hotel.domain.Empleado;
import com.hotel.domain.Persona;
import com.hotel.service.EmpleadoService;
import com.hotel.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService _EmpleadoService;

    @Autowired
    private PersonaService _PersonaService;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Empleado> result = _EmpleadoService.getEmpleados();
        model.addAttribute("empleados", result);
        model.addAttribute("totalEmpleados", result.size());
        return "layout/empleados/ListaEmpleado :: ListaEmpleado";
    }

    //Modificar y guardar persona y luego conexion con empleado
    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute Persona persona) {
        //Guardo la persona
        _PersonaService.guardar(persona);
        //Creo el empleado
        Empleado empleado = new Empleado();
        //Guardo la persona en empleado
        empleado.setPersona(persona);
        //Guardo en base de datos el nuevo empleado
        _EmpleadoService.guardar(empleado);
        return "redirect:/";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Persona());
        return "layout/empleadoes/AgregarCliente :: AgregarCliente";
    }
}

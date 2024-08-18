package com.hotel.controller;

import com.hotel.domain.Habitacion;
import com.hotel.service.HabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/habitacion")
public class HabitacionController {

    @Autowired
    private HabitacionService _HabitacionService;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Habitacion> result = _HabitacionService.getHabitaciones(true);
        model.addAttribute("Habitaciones", result);
        model.addAttribute("totalHabitaciones", result.size());
        return "layout/habitaciones/ListaHabitacion :: ListaHabitacion";
    }
    
    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Habitacion habitacion) {
        _HabitacionService.guardar(habitacion);
        return "redirect:/";
    }
    
    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("habitacion", new Habitacion());
        return "layout/habitaciones/AgregarHabitacion :: AgregarHabitacion";
    }
}

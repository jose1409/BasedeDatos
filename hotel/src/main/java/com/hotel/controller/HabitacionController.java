package com.hotel.controller;

import com.hotel.domain.Habitacion;
import com.hotel.domain.Hotel;
import com.hotel.service.HabitacionService;
import com.hotel.service.HotelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequestMapping("/habitacion")
public class HabitacionController {

    @Autowired
    private HabitacionService _HabitacionService;
    @Autowired
    private HotelService _HotelService;

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
        List<Hotel> result = _HotelService.getHoteles(true);
        System.out.println(result);
        model.addAttribute("habitacion", new Habitacion());
        model.addAttribute("hoteles", result);
        return "layout/habitaciones/AgregarHabitacion :: AgregarHabitacion";
    }

    @GetMapping("/eliminar/{idHabitacion}")
    public String habitacionEliminar(@PathVariable("idHabitacion") Long idHabitacion) {
        System.out.println("Id de la categoria: " + idHabitacion);
        Habitacion habitacion = _HabitacionService.getById(idHabitacion);
        if (habitacion != null) {
            _HabitacionService.eliminar(habitacion);
            System.out.println("Habitacion eliminada: " + habitacion);
        } else {
            System.out.println("Habitacion no encontrada con el ID: " + idHabitacion);
        }
        return "redirect:/habitacion/inicio";
    }

    @GetMapping("/modificar/{idHabitacion}")
    public String habitacionModificar(@PathVariable("idHabitacion") Long idHabitacion, Model model) {
        Habitacion habitacion = _HabitacionService.getById(idHabitacion);
        List<Hotel> result = _HotelService.getHoteles(true);
        model.addAttribute("hoteles", result);
        model.addAttribute("habitacion", habitacion);
        return "layout/habitaciones/AgregarHabitacion :: AgregarHabitacion";
    }
}

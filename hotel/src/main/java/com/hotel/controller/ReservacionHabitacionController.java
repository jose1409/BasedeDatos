package com.hotel.controller;

import com.hotel.domain.ReservacionHabitacion;
import com.hotel.service.ReservacionHabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservacionHabitacion")
public class ReservacionHabitacionController {
    
    @Autowired
    private ReservacionHabitacionService _ReservacionHabitacionService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<ReservacionHabitacion> result = _ReservacionHabitacionService.getReservacionHabitaciones();
        model.addAttribute("ReservacionHabitaciones", result);
        model.addAttribute("totalReservacionHabitaciones", result.size());
        return "layout/reservacionHabitacion/ListaReservacionHabitaciones :: ListaReservacionHabitaciones";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute ReservacionHabitacion reservacionHabitacion) {
        _ReservacionHabitacionService.guardar(reservacionHabitacion);
        return "redirect:/restaurante/inicio";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("reservacionHabitacion", new ReservacionHabitacion());
        return "layout/ReservacionHabitaciones/ListaReservacionHabitaciones :: AgregarReservacionHabitaciones";
    }
}

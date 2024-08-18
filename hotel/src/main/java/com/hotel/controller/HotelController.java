package com.hotel.controller;

import com.hotel.domain.Hotel;
import com.hotel.service.HotelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService _HotelService;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Hotel> result = _HotelService.getHoteles(true);
        model.addAttribute("Hoteles", result);
        model.addAttribute("totalHoteles", result.size());
        System.out.println("datos" + result.getFirst());
        return "layout/habitaciones/ListaHabitacion :: ListaHabitacion";
    }
    
    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Hotel hotel) {
        _HotelService.guardar(hotel);
        return "redirect:/";
    }
    
    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "layout/habitaciones/AgregarHabitacion :: AgregarHabitacion";
    }
}

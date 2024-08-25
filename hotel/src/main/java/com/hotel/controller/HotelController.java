package com.hotel.controller;

import com.hotel.domain.Direccion;
import com.hotel.domain.Hotel;
import com.hotel.service.DireccionService;
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
    @Autowired
    private DireccionService _DireccionService;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Hotel> result = _HotelService.getHoteles(true);
        model.addAttribute("Hoteles", result);
        model.addAttribute("totalHoteles", result.size());
        return "layout/hoteles/ListaHoteles";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Hotel hotel) {
        _DireccionService.guardar(hotel.getDireccion());
        _HotelService.guardar(hotel);
        
        return "redirect:/hotel/inicio";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "layout/hoteles/AgregarHoteles :: AgregarHoteles";
    }
}

package com.hotel.controller;

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
        _HotelService.guardar(hotel);
        _DireccionService.guardar(hotel.getDireccion());
        return "redirect:/";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "layout/hoteles/AgregarHoteles :: AgregarHoteles";
    }
}

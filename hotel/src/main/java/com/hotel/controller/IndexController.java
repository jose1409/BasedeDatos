package com.hotel.controller;

import com.hotel.domain.Habitacion;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String inicio(@RequestParam(name = "render", required = false, defaultValue = "1") int render, Model model) {
        model.addAttribute("render", render);
        return "index";  // Sin barra inclinada al inicio
    }
    
    @GetMapping("/render")
    public String renderComponent(@RequestParam("render") int render, Model model) {
        model.addAttribute("render", render);
        if (render == 1) {
            return "layout/habitaciones/ListaHabitacion :: ListaHabitacion";
        } else if (render == 2) {
            return "layout/hoteles/ListaHoteles :: ListaHoteles";
        }
        return "index";
    }
}


package com.hotel.controller;

import com.hotel.domain.Habitacion;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("render", 1);
        return "/index"; // Asegúrate de que no haya una barra inclinada ("/") aquí
    }
}


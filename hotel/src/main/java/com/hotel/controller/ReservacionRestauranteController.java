package com.hotel.controller;

import com.hotel.domain.ReservacionRestaurante;
import com.hotel.service.ReservacionRestauranteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservacionRestaurante")
public class ReservacionRestauranteController {
    
    @Autowired
    private ReservacionRestauranteService _ReservacionRestauranteService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<ReservacionRestaurante> result = _ReservacionRestauranteService.getReservacionRestaurantes();
        model.addAttribute("ReservacionRestaurantes", result);
        model.addAttribute("totalReservacionRestaurantes", result.size());
        return "layout/reservacionRestaurante/ListaReservacionRestaurantes :: ListaReservacionRestaurantes";
    }
}

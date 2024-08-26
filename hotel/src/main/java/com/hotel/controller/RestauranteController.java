package com.hotel.controller;

import com.hotel.domain.Restaurante;
import com.hotel.service.RestauranteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurante")
public class RestauranteController {
    
    
    @Autowired
    private RestauranteService _RestauranteService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Restaurante> result = _RestauranteService.getRestaurantes(true);
        model.addAttribute("Restaurantes", result);
        model.addAttribute("totalRestaurantes", result.size());
        return "layout/restaurantes/ListaRestaurantes";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Restaurante restaurante) {
        _RestauranteService.guardar(restaurante);
        
        return "redirect:/restaurante/inicio";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("restaurante", new Restaurante());
        return "layout/restaurantes/ListaRestaurantes :: AgregarRestaurantes";
    }
}

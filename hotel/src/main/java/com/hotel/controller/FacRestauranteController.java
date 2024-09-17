package com.hotel.controller;

import com.hotel.domain.FacRestaurante;
import com.hotel.service.FacRestauranteService;
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
@RequestMapping("/facRestaurante")
public class FacRestauranteController {
    
    @Autowired
    private FacRestauranteService _FacRestaurante;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<FacRestaurante> result = _FacRestaurante.getFacRestaurantes();
        System.out.println("-------------------------------------------------" + result.getFirst().getPlatilloMultiple());
        model.addAttribute("FacRestaurantes", result);
        model.addAttribute("totalFacRestaurantes", result.size());
        return "layout/FacRestaurante/ListaFacRestaurantes :: ListaFacRestaurantes";
    }
}

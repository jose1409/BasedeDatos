package com.hotel.controller;

import com.hotel.domain.Platillo;
import com.hotel.service.PlatilloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/platillo")
public class PlatilloController {
    
    @Autowired
    private PlatilloService _PlatilloService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Platillo> result = _PlatilloService.getPlatillos(true);
        model.addAttribute("Platillos", result);
        model.addAttribute("totalPlatillos", result.size());
        return "layout/Platillos/ListaPlatillos";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Platillo platillo) {
        _PlatilloService.guardar(platillo);
        return "redirect:/restaurante/inicio";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("platillo", new Platillo());
        return "layout/platillos/ListaPlatillos :: AgregarPlatillos";
    }
}

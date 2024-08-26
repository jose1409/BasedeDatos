package com.hotel.controller;

import com.hotel.domain.Servicio;
import com.hotel.service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicio")
public class ServicioController {
    
    @Autowired
    private ServicioService _ServicioService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Servicio> result = _ServicioService.getServicios();
        model.addAttribute("Servicios", result);
        model.addAttribute("totalServicios", result.size());
        return "layout/servicios/ListaServicios";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute Servicio servicio) {
        _ServicioService.guardar(servicio);
        return "redirect:/";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "layout/servicios/AgregarServicios :: AgregarServicios";
    }
}

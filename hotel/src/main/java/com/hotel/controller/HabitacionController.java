package com.hotel.controller;

import com.hotel.domain.Habitacion;
import com.hotel.service.HabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/habitacion")
public class HabitacionController {
    
    @Autowired
    private HabitacionService _HabitacionService;
    
    @GetMapping("/inicio")
    public String inicio(Model model){
        List<Habitacion> result = _HabitacionService.getHabitaciones(true);
        System.err.println("Habitacion: "+ result);
        model.addAttribute("Habitaciones", result);
        model.addAttribute("totalHabitaciones", result.size());
        return "/layout/habitaciones/ListaHabitacion";
    }
}

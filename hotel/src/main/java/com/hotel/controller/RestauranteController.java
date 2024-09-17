package com.hotel.controller;

import com.hotel.domain.Hotel;
import com.hotel.domain.Restaurante;
import com.hotel.service.HotelService;
import com.hotel.service.RestauranteService;
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
@RequestMapping("/restaurante")
public class RestauranteController {
    
    
    @Autowired
    private RestauranteService _RestauranteService;
    
    @Autowired
    private HotelService _hotelService;
    
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
        
        return "redirect:/";
    }

    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        List<Hotel> hoteles = _hotelService.getHoteles(true);
        model.addAttribute("rest", new Restaurante());
        model.addAttribute("hoteles", hoteles);
        return "layout/restaurantes/AgregarRestaurante :: AgregarRestaurante";
    }
    
    @GetMapping("/modificar/{idRestaurante}")
    public String restauranteModificar(@PathVariable("idRestaurante") Long idRestaurante, Model model) {
        Restaurante rest = _RestauranteService.getById(idRestaurante);
        List<Hotel> hoteles = _hotelService.getHoteles(true);
        model.addAttribute("hoteles", hoteles);
        model.addAttribute("rest", rest);
        return "layout/restaurantes/AgregarRestaurante :: AgregarRestaurante";
    }
    
    @GetMapping("/eliminar/{idRestaurante}")
    public String empleadoEliminar(@PathVariable("idRestaurante") Long idRestaurante, Model model) {
        Restaurante rest = _RestauranteService.getById(idRestaurante);
        if (rest != null) {
            _RestauranteService.eliminar(rest);
        } else {
            System.out.println("Hotel no encontrado con el ID: " + idRestaurante);
        }
        return "redirect:/restaurante/inicio";
    }
}

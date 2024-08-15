package com.hotel.controller;

import com.hotel.domain.Hotel;
import com.hotel.service.HotelService;
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
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService _HotelService;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Hotel> result = _HotelService.getHoteles(true);
        model.addAttribute("Hotel", result);
        model.addAttribute("totalHoteles", result.size());
        return "layout/hoteles/ListaHoteles :: ListaHoteles";
    }
}

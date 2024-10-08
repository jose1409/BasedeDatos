package com.hotel.controller;

import com.hotel.domain.Cliente;
import com.hotel.domain.Persona;
import com.hotel.service.ClienteService;
import com.hotel.service.PersonaService;
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
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService _ClienteService;
    
    @Autowired
    private PersonaService _PersonaService;
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        List<Cliente> result = _ClienteService.getClientes();
        model.addAttribute("clientes", result);
        model.addAttribute("totalClientes", result.size());
        return "layout/clientes/ListaCliente :: ListaCliente";
    }
    
    //Modificar y guardar persona y luego conexion con cliente
    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute Persona persona) {
        //Guardo la persona
        _PersonaService.guardar(persona);
        //Creo el cliente
        Cliente cliente = new Cliente();
        //Guardo la persona en cliente
        cliente.setPersona(persona);
        //Guardo en base de datos el nuevo cliente
        _ClienteService.guardar(cliente);
        return "redirect:/";
    }
    
    //Modificar y guardar persona y luego conexion con cliente
    @PostMapping("/actualizar")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        //Guardo la persona
        _PersonaService.guardar(cliente.getPersona());
        //Guardo en base de datos el nuevo cliente
        _ClienteService.guardar(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/crear")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Persona());
        return "layout/clientes/AgregarCliente :: AgregarCliente";
    }
    
    @GetMapping("/eliminar/{idCliente}")
    public String clienteEliminar(@PathVariable("idCliente") Long idCliente, Model model) {
        Cliente cliente = _ClienteService.getById(idCliente);
        if (cliente != null) {
            _PersonaService.eliminar(cliente.getPersona());
        } else {
            System.out.println("Hotel no encontrado con el ID: " + idCliente);
        }
        return "redirect:/cliente/inicio";
    }
    @GetMapping("/modificar/{idCliente}")
    public String clienteModificar(@PathVariable("idCliente") Long idCliente, Model model) {
        Cliente cliente = _ClienteService.getById(idCliente);
        model.addAttribute("cliente", cliente);
        return "layout/clientes/ModificarCliente :: ModificarCliente";
    }
}

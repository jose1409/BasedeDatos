/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    // Se obtiene un listado de Clientes en un List
    public List<Cliente> getClientes();

    // Se obtiene un Cliente, a partir del id de un Cliente
    public Cliente getCliente(Cliente cliente);

    // Se inserta un nuevo Cliente si el id del Cliente esta vacío
    // Se actualiza un Cliente si el id del Cliente NO esta vacío
    public void guardar(Cliente cliente);

    // Se elimina el Cliente que tiene el id pasado por parámetro
    public void eliminar(Cliente cliente);
}

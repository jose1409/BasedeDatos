package com.hotel.service.impl;

import com.hotel.dao.ClienteDao;
import com.hotel.domain.Cliente;
import com.hotel.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> getClientes() {
        var lista = clienteDao.findAll();
        return lista;
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    public void guardar(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}

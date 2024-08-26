package com.hotel.service.impl;

import com.hotel.domain.Cliente;
import com.hotel.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.dao.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDao;

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

    @Override
    public Cliente getById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }
}

package com.co.globant.cine.service;
import com.co.globant.cine.model.ClienteModel;
import com.co.globant.cine.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService implements Cliente_Service {

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public ArrayList<ClienteModel> getAllClientemodel() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    @Override
    public Optional<ClienteModel> getClienteById(long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public ClienteModel saveCliente(ClienteModel a) {
        return clienteRepository.save(a);
    }

    @Override
    public boolean deleteCliente(long id) {
        try {
            Optional<ClienteModel> a= getClienteById(id);
            clienteRepository.delete(a.get());
            return true;

        }catch (Exception e){
            return false;
        }
    }
}

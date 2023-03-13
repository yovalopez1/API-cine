package com.example.demo.service;
import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService implements Cliente_Service {

    @Autowired
    ClienteRepository cineRepository;

    @Override
    public ArrayList<ClienteModel> getAllClientemodel() {
        return (ArrayList<ClienteModel>) cineRepository.findAll();
    }

    @Override
    public Optional<ClienteModel> getClienteById(long id) {
        return cineRepository.findById(id);
    }

    @Override
    public ClienteModel saveCliente(ClienteModel a) {
        return cineRepository.save(a);
    }

    @Override
    public boolean deleteCliente(long id) {
        try {
            Optional<ClienteModel> a= getClienteById(id);
            cineRepository.delete(a.get());
            return true;

        }catch (Exception e){
            return false;
        }
    }
}

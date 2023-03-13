package com.example.demo.service;
import com.example.demo.model.ClienteModel;


import java.util.ArrayList;
import java.util.Optional;

public interface Cliente_Service {
    ArrayList<ClienteModel> getAllClientemodel();
    Optional<ClienteModel> getClienteById(long id);
    ClienteModel saveCliente(ClienteModel a);
    boolean deleteCliente(long id);

}

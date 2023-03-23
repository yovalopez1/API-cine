package com.co.globant.cine.service;
import com.co.globant.cine.model.ClienteModel;


import java.util.ArrayList;
import java.util.Optional;

public interface Cliente_Service {

    ArrayList<ClienteModel> getAllClientemodel();
    Optional<ClienteModel> getClienteById(long id);
    ClienteModel saveCliente(ClienteModel a);
    boolean deleteCliente(long id);

}

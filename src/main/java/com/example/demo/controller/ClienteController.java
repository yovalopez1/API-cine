package com.example.demo.controller;

import com.example.demo.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ClienteService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente/")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    private ArrayList<ClienteModel> getAllClientemodel(){
        return clienteService.getAllClientemodel();
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel> getClienteById(@PathVariable("id")long id){
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteModel saveCliente(@RequestBody ClienteModel a){
        return clienteService.saveCliente(a);
    }

    @DeleteMapping("/{id}")
    public String deleteCliente(@PathVariable("id")long id) {
        if (clienteService.deleteCliente(id)) {
            return "Se borro el cine";
        } else {
            return "No se borro el cine";
        }
    }
}

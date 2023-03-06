package com.example.demo.rest;

import com.example.demo.model.CineModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.CineService;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cine/")
public class CineRest {
    @Autowired
    private CineService cineService;

    @GetMapping
    private ArrayList<CineModel> getAllCine(){
        return cineService.getAllCinemodel();
    }

    @GetMapping("/{id}")
    public Optional<CineModel> getCineById(@PathVariable("id")long id){
        return cineService.getCineById(id);
    }

    @PostMapping
    public CineModel saveCine(@RequestBody CineModel a){
        return cineService.saveCine(a);
    }

    @DeleteMapping("/{id}")
    public String deleteCine(@PathVariable("id")long id) {
        if (cineService.deleteCine(id)) {
            return "Se borro el cine";
        } else {
            return "No se borro el cine";
        }
    }
}

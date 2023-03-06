package com.example.demo.service;
import com.example.demo.model.CineModel;
import com.example.demo.repository.CineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class CineService implements Cine_Service{

    @Autowired
    CineRepository cineRepository;

    @Override
    public ArrayList<CineModel> getAllCinemodel() {
        return (ArrayList<CineModel>) cineRepository.findAll();
    }

    @Override
    public Optional<CineModel> getCineById(long id) {
        return cineRepository.findById(id);
    }

    @Override
    public CineModel saveCine(CineModel a) {
        return cineRepository.save(a);
    }

    @Override
    public boolean deleteCine(long id) {
        try {
            Optional<CineModel> a= getCineById(id);
            cineRepository.delete(a.get());
            return true;

        }catch (Exception e){
            return false;
        }
    }
}

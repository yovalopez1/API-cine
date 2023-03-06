package com.example.demo.service;
import com.example.demo.model.CineModel;


import java.util.ArrayList;
import java.util.Optional;

public interface Cine_Service {
    ArrayList<CineModel> getAllCinemodel();
    Optional<CineModel> getCineById(long id);
    CineModel saveCine(CineModel a);
    boolean deleteCine(long id);

}

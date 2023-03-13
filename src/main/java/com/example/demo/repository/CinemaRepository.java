package com.example.demo.repository;

import com.example.demo.model.CinemaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends CrudRepository<CinemaModel,Long> {
}

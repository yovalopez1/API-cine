package com.example.demo.repository;

import com.example.demo.model.CineModel;
import com.example.demo.model.CineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends CrudRepository<CineModel,Long> {

}

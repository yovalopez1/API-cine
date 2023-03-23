package com.co.globant.cine.repository;

import com.co.globant.cine.model.PeliculaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<PeliculaModel,Long> {
}

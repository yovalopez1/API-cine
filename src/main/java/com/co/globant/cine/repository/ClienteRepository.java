package com.co.globant.cine.repository;

import com.co.globant.cine.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel,Long> {

}

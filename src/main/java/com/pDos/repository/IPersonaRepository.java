package com.pDos.repository;

import com.pDos.dto.Persona;
import org.springframework.data.repository.CrudRepository;


public interface IPersonaRepository extends CrudRepository<Persona, Long> {

}

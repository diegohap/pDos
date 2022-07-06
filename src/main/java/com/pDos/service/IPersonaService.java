package com.pDos.service;

import com.pDos.dto.Persona;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IPersonaService {
    Iterable<Persona> getAllPersonas();
    Optional<Persona> getPersonaById(Long id);
    Persona createNewPersona(Persona persona);

}

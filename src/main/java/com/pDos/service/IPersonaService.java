package com.pDos.service;

import com.pDos.dto.Persona;
import org.springframework.http.ResponseEntity;

public interface IPersonaService {

    public Iterable<Persona> getAllPersonas();
}

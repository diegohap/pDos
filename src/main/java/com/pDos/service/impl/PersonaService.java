package com.pDos.service.impl;

import com.pDos.dto.Persona;
import com.pDos.repository.IPersonaRepository;
import com.pDos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Cristian el elfo fifi
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository iPersonaRepository;

    @Override
    public Iterable<Persona> getAllPersonas() {
        return iPersonaRepository.findAll();
    }
}

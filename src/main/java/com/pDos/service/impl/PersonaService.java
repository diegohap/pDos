package com.pDos.service.impl;

import com.pDos.dto.Persona;
import com.pDos.repository.IPersonaRepository;
import com.pDos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

// Cristian el elfo fifi
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository iPersonaRepository;

    @Override
    public Iterable<Persona> getAllPersonas() {
        return iPersonaRepository.findAll();
    }

    @Override
    public Optional<Persona> getPersonaById(final Long id) {
        return iPersonaRepository.findById(id);
    }

    @Override
    public Persona createNewPersona(Persona persona) {
        return iPersonaRepository.save(persona);
    }


}

package com.pDos.controller;

import com.pDos.dto.Persona;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Api(value = "Api con la tabla Persona", tags = "Api de consultas a Persona")
public interface IAPIPersonaController {

    ResponseEntity<Iterable<Persona>> getAllPersonas();
    ResponseEntity<Persona> getPersonasById(@PathVariable(value = "id") Long id);
    ResponseEntity<Persona> createNewPersona(@RequestBody Persona persona);
}

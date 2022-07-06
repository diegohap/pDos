package com.pDos.controller.impl;

import com.pDos.controller.IAPIPersonaController;
import com.pDos.dto.Persona;
import com.pDos.exception.NotFoundException;
import com.pDos.service.IPersonaService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/listas")
public class APIPersonaController implements IAPIPersonaController {

    @Autowired
    IPersonaService iPersonaService;

    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    @Override
    public ResponseEntity<Iterable<Persona>> getAllPersonas(){
        return ResponseEntity.ok(iPersonaService.getAllPersonas());
    }

    @RequestMapping(value = "/persona/{id}", method = RequestMethod.GET)
    @Override
    public ResponseEntity<Persona> getPersonasById(@ApiParam(example = "1")Long id){
        //return ResponseEntity.ok(iPersonaService.getPersonaById(id));
        return iPersonaService.getPersonaById(id).map(ResponseEntity::ok).orElseThrow(() -> new NotFoundException("Persona not found"));
    }

    @RequestMapping(value = "/createNewPersona", method = RequestMethod.POST)
    @Override
    public ResponseEntity<Persona> createNewPersona(@RequestBody Persona persona){
        if(Persona.isValid(persona))
            return ResponseEntity.ok(iPersonaService.createNewPersona(persona));
        else
            throw new NotFoundException("datos invalidos");
    }

}

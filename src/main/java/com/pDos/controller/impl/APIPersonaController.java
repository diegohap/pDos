package com.pDos.controller.impl;

import com.pDos.controller.IAPIPersonaController;
import com.pDos.dto.Persona;
import com.pDos.repository.IPersonaRepository;
import com.pDos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping(path = "/listas")
public class APIPersonaController implements IAPIPersonaController {

    @Autowired
    IPersonaService iPersonaService;

    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Persona>> getAllPersonas(){
        return ResponseEntity.ok(iPersonaService.getAllPersonas());
    }
}

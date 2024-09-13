package com.grupoSa.demoGrupoSa.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtos.request.response.CreateBookDto;
import com.grupoSa.demoGrupoSa.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    
    public ResponseEntity<?> getTimes() {

       var times = usuarioService.getAlltimes();

        return ResponseEntity.ok(times);

    }


    
    @PostMapping
   public ResponseEntity<?>postMethodName (@RequestBody CreateBookDto createBookDto){


    usuarioService.createUsuario(createBookDto);

    

    


   

    return ResponseEntity.status(201).build();

    }

}
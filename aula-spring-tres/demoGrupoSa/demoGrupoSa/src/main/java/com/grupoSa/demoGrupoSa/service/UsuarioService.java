package com.grupoSa.demoGrupoSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtos.request.response.CreateBookDto;
import com.grupoSa.demoGrupoSa.entities.UsuarioEntities;
import com.grupoSa.demoGrupoSa.repositories.usuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    usuarioRepository usuarioRepository;

    public List<UsuarioEntities> getAlltimes(){

        return usuarioRepository.findAll();



    }
    public void createUsuario(CreateBookDto createBookDto){

        UsuarioEntities entity = new UsuarioEntities();
        entity.setEmail(createBookDto.getEmail());
        entity.setTelefone(createBookDto.getTelefone());
       entity.setIdade(createBookDto.getIdade());
        entity.setNacionalidade(createBookDto.getNacionalidade());

        usuarioRepository.save(entity);

    }
   
}

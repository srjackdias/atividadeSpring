package com.grupoSa.demoGrupoSa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoSa.demoGrupoSa.entities.UsuarioEntities;

public interface usuarioRepository extends JpaRepository<UsuarioEntities ,Long> {

    static Object getAlltimes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlltimes'");
    }
    
}

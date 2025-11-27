package com.example.demo.repos.mongo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.mongo.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository <Usuario, String> {
    Optional<Usuario> findByUsuario(String usuario);

    boolean existsByUsuario(String adminUsuario);

    boolean existsByCorreo(String correo);

    
}

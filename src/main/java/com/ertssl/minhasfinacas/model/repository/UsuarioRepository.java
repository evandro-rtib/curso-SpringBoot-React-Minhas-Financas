package com.ertssl.minhasfinacas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ertssl.minhasfinacas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}

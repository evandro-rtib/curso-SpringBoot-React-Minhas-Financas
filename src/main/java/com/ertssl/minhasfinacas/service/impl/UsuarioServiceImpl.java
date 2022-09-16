package com.ertssl.minhasfinacas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ertssl.minhasfinacas.model.entity.Usuario;
import com.ertssl.minhasfinacas.model.repository.UsuarioRepository;
import com.ertssl.minhasfinacas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	
	private UsuarioRepository repository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}

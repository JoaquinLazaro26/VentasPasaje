package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Usuario;
import net.cibertec.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	@Autowired
	private UsuarioRepository repo;
	
	private List<Usuario> listarUsuario(){
		return repo.findAll();
	}

}


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
	
	public void registarUsuario(Usuario usuario) {
		 repo.save(usuario);
	}
	
	public void actualizarUsuario(Usuario usuario) {
		repo.save(usuario);
	}
	
	public void eliminarUsuario(Integer cod) {
		repo.deleteById(cod);
	}
	
	public List<Usuario> listarUsuario(){
		return repo.findAll();
	}

	public Usuario buscarUsuario(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}


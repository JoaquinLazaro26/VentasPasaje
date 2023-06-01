package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Cliente;
import net.cibertec.repository.ClienteRespository;

@Service
public class ClienteServices {
	@Autowired
	private ClienteRespository repo;
	
	public List<Cliente> listarCliente(){
		return repo.findAll();
	}

	public void registrarCliente(Cliente cliente) {
		repo.save(cliente);
	}
	
	public void actualizarCliente(Cliente cliente) {
		repo.save(cliente);
	}
	
	public void eliminarCliente(Integer cod) {
		repo.deleteById(cod);
	}
	
	public Cliente buscarCliente(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
}

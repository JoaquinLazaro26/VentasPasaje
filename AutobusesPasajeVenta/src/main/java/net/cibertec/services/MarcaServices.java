package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Marca;
import net.cibertec.repository.MarcaRepository;

@Service
public class MarcaServices {
	@Autowired
	private MarcaRepository repo;
	
	private List<Marca> listarMarca(){
		return repo.findAll();
	}

}

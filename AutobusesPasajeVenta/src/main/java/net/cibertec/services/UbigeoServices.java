package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Ubigeo;
import net.cibertec.repository.UbigeoRepository;

@Service
public class UbigeoServices {
	@Autowired
	private UbigeoRepository repo;
	
	private List<Ubigeo> listarUbigeo(){
		return repo.findAll();
	}

}

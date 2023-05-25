package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Cargo;
import net.cibertec.repository.CargoRepository;

@Service
public class CargoServices {
	@Autowired
	private CargoRepository repo;
	
	public List<Cargo> listarCargo(){
		return repo.findAll();
	}
	

}

package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.CargoMenuPK;
import net.cibertec.repository.CargoMenuPKRepository;

@Service
public class CargoMenuPKServices {
	@Autowired
	private CargoMenuPKRepository repo;
	
	private List<CargoMenuPK> listarCargoMenuPK(){
		return repo.findAll();
	}

}

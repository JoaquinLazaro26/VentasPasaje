<<<<<<< HEAD
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.CargoMenu;
import net.cibertec.repository.CargoMenuRepository;

@Service 
public class CargoMenuServices {
	@Autowired
	private CargoMenuRepository repo;
	
	private List<CargoMenu> listarCargoMenu(){
		return repo.findAll();
	}

}
=======
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.CargoMenu;
import net.cibertec.repository.CargoMenuRepository;

@Service 
public class CargoMenuServices {
	@Autowired
	private CargoMenuRepository repo;
	
	private List<CargoMenu> listarCargoMenu(){
		return repo.findAll();
	}

}
>>>>>>> branch 'main' of https://github.com/JoaquinLazaro26/VentasPasaje.git

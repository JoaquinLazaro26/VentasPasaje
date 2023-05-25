<<<<<<< HEAD
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Buses;
import net.cibertec.repository.BusesRepository;

@Service

public class BusesServices {
	@Autowired
	private BusesRepository repo;
	
	public List<Buses> listarBuses(){
		return repo.findAll();
	}

}
=======
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Buses;
import net.cibertec.repository.BusesRepository;

@Service

public class BusesServices {
	@Autowired
	private BusesRepository repo;
	
	public List<Buses> listarBuses(){
		return repo.findAll();
	}

}
>>>>>>> branch 'main' of https://github.com/JoaquinLazaro26/VentasPasaje.git

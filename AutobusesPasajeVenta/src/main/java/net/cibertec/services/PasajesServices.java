<<<<<<< HEAD
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Pasajes;
import net.cibertec.repository.PasajesRepository;

@Service
public class PasajesServices {
	@Autowired
	private PasajesRepository repo;
	
	private List<Pasajes> listarPasajes(){
		return repo.findAll();
	}

}
=======
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Pasajes;
import net.cibertec.repository.PasajesRepository;

@Service
public class PasajesServices {
	@Autowired
	private PasajesRepository repo;
	
	private List<Pasajes> listarPasajes(){
		return repo.findAll();
	}

}
>>>>>>> branch 'main' of https://github.com/JoaquinLazaro26/VentasPasaje.git

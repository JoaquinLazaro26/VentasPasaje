<<<<<<< HEAD
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Horarios;
import net.cibertec.repository.HorariosRepository;

@Service 
public class HorariosServices {
	@Autowired
	private HorariosRepository repo;
	
	public List<Horarios> listarHorarios(){
		return repo.findAll();
	}

}
=======
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Horarios;
import net.cibertec.repository.HorariosRepository;

@Service 
public class HorariosServices {
	@Autowired
	private HorariosRepository repo;
	
	public List<Horarios> listarHorarios(){
		return repo.findAll();
	}

}
>>>>>>> branch 'main' of https://github.com/JoaquinLazaro26/VentasPasaje.git

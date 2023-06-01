package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Buses;
import net.cibertec.entity.Usuario;
import net.cibertec.repository.BusesRepository;

@Service

public class BusesServices {
	@Autowired
	private BusesRepository repo;
	
	public List<Buses> listarBuses(){
		return repo.findAll();
	}

	
	public void registarBuses(Buses buses) {
		 repo.save(buses);
	}
	
	public void actualizarBuses(Buses buses) {
		repo.save(buses);
	}
	
	public void eliminarBuses(Integer cod) {
		repo.deleteById(cod);
	}
	

	public Buses buscarBuses(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}

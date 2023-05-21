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
	
	public List<String> listarDepartamentos(){
		return repo.listaDepartamento();
	}

	public List<String> listarProvincias(String departamento){
		return repo.listaProvincia(departamento);
	}
	
	public List<Ubigeo> listarDistritos(String provincia){
		return repo.listaDistrito(provincia);
	}
}

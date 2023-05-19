package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Menu;
import net.cibertec.repository.MenuRepository;

@Service
public class MenuServices {
	@Autowired
	private MenuRepository repo;
	
	private List<Menu> listarMenu(){
		return repo.findAll();
	}

}

<<<<<<< HEAD
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Cliente;
import net.cibertec.repository.ClienteRespository;

@Service
public class ClieneteServices {
	@Autowired
	private ClienteRespository repo;
	
	private List<Cliente> listarCliente(){
		return repo.findAll();
	}

}
=======
package net.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cibertec.entity.Cliente;
import net.cibertec.repository.ClienteRespository;

@Service
public class ClieneteServices {
	@Autowired
	private ClienteRespository repo;
	
	private List<Cliente> listarCliente(){
		return repo.findAll();
	}

}
>>>>>>> branch 'main' of https://github.com/JoaquinLazaro26/VentasPasaje.git

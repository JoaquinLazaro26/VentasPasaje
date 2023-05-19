package net.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cibertec.entity.Cliente;

public interface ClienteRespository extends JpaRepository<Cliente, Integer>{

}

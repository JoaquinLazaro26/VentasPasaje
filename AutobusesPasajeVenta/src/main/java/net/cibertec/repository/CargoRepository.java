package net.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cibertec.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer>  {

}

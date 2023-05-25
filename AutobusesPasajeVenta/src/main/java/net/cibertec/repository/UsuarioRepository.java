package net.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cibertec.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

package net.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.cibertec.entity.Menu;
import net.cibertec.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query("select u from Usuario u where u.login =?1")
	public Usuario iniciarSesion(String vLogin);
	
	@Query("select m from CargoMenu cm join cm.menu m where cm.cargo.codigo =?1 ")
	public List<Menu> traerMenuUsuario(int codigoCargo);
}

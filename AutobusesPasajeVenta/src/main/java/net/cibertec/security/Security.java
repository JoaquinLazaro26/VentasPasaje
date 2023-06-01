package net.cibertec.security;

import java.security.Provider.Service;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.cibertec.entity.Usuario;
import net.cibertec.services.UsuarioServices;

public class Security implements UserDetailsService {
	
	@Autowired
	private UsuarioServices usuarioServicio;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails obj = null;
		Usuario bean = usuarioServicio.loginUsuario(username);
		//rol del usuario
		Set<GrantedAuthority> cargo = new HashSet<GrantedAuthority>();
		
		//adicionar dentro del objeto"rol" del usuario actual 
		cargo.add(new SimpleGrantedAuthority(bean.getCargo().getNombre()));
		
		//crear obj 
		obj= new User(username,bean.getPassword(),cargo);
		
		return obj;
	}
}

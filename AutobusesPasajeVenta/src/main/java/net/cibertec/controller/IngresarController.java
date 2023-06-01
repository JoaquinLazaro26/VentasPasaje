package net.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import net.cibertec.entity.Menu;
import net.cibertec.entity.Usuario;
import net.cibertec.services.UsuarioServices;


@SessionAttributes({"datosUsuario","menu"})
@Controller
@RequestMapping("/ingresar")
public class IngresarController {

	@Autowired 
	private UsuarioServices usuarioServicio;
	
	@RequestMapping("/login")
	public String login(){		
		return "login";
	}
	
	@RequestMapping("/principal")
	public String principal(){		
		return "principal";
	}
	
	@RequestMapping("/index")
	public String index(Authentication auth,Model model){

		String nomUsuario = auth.getName();
		Usuario bean=usuarioServicio.loginUsuario(nomUsuario);
		List<Menu> lista = usuarioServicio.MenuUsuario(bean.getCargo().getCodigo());
		model.addAttribute("datosUsuario",bean.getApellido()+" "+bean.getNombre());
		model.addAttribute("menu",lista);
		return "index";
	}
}
  
package net.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import net.cibertec.entity.Enlace;
import net.cibertec.entity.Usuario;
import net.cibertec.service.UsuarioService;
import net.cibertec.services.UsuarioServices;
@SessionAttributes({"datosUsuario","enlaces"})
@Controller
@RequestMapping("/validar")
public class ValidarController {
	@Autowired
	private UsuarioServices servicio;
	
	@RequestMapping("/usuario")
	public String index(){
		
		return "login";
	}
	@RequestMapping("/intranet")
	public String intranet(Authentication auth,Model model){
		String nomUsuario=auth.getName();
		Usuario bean=servicio.loginUsuario(nomUsuario);
		List<Enlace> lista=servicio.enlacesDelUsuario(bean.getRol().getCodigo());
		model.addAttribute("datosUsuario",bean.getApellido()+" "+bean.getNombre());
		model.addAttribute("enlaces",lista);
		
		
		return "intranet";
	}
	
}

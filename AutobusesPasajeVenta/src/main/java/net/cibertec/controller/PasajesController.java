package net.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pasaje")
public class PasajesController {

	
	@RequestMapping("/lista")
	public String lista() {
		return "ventas";
	}
}
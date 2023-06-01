package net.cibertec.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.cibertec.entity.Cargo;
import net.cibertec.entity.Cliente;
import net.cibertec.entity.Ubigeo;
import net.cibertec.entity.Usuario;
import net.cibertec.services.ClienteServices;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteServices clienteServicio;
	
	@RequestMapping("/lista")
	private String lista(Model model) {
		model.addAttribute("client", clienteServicio.listarCliente());
		return "clientes";
	}
	
	@RequestMapping("grabar")
	private String grabar(@RequestParam("codigo") Integer codCliente,
						  @RequestParam("nombre") String nom,
						  @RequestParam("apellido") String ape,
						  @RequestParam("dni") String dni,
						  @RequestParam("fechaNac") String fech,
						  @RequestParam("celular") String cel,
						  @RequestParam("sexo") String sexo,
						  @RequestParam("distrito") String codUbigeo,//Uso el name 'distrito' ya que es el que almacena el codigo
						  RedirectAttributes redirect) {
		try {
			Cliente c = new Cliente();
			c.setNombre(nom);
			c.setApellido(ape);
			c.setDni(dni);
			c.setFecha(LocalDate.parse(fech));
			c.setCelular(cel);
			c.setSexo(sexo);

			Ubigeo ubi = new Ubigeo();

			ubi.setCodigo(codUbigeo);
			

			c.setUbigeoCliente(ubi);
			
			if(codCliente == 0) {
				clienteServicio.registrarCliente(c);
				redirect.addFlashAttribute("MENSAJE","Cliente Registrado");
			}else {
				c.setCodigo(codCliente);
				clienteServicio.actualizarCliente(c);
				redirect.addFlashAttribute("MENSAJE","Cliente Actualizado");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
		}
		return "redirect:/cliente/lista";
	}
		
	
	@RequestMapping("buscar")
	@ResponseBody
	private Cliente buscar(@RequestParam("codigo") Integer cod) {
		return clienteServicio.buscarCliente(cod);
	}
	
	@RequestMapping("eliminar")
	private String eliminar(@RequestParam("codigoEliminar") Integer cod,
							RedirectAttributes redirect) {
		clienteServicio.eliminarCliente(cod);
		redirect.addAttribute("MENSAJE","Cliente Eliminado");
		return "redirect:/cliente/lista";
	}
}

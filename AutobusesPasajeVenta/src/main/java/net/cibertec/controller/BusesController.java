package net.cibertec.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.cibertec.entity.Buses;
import net.cibertec.entity.Cargo;
import net.cibertec.entity.Horarios;
import net.cibertec.entity.Marca;
import net.cibertec.entity.Rutas;
import net.cibertec.entity.Ubigeo;
import net.cibertec.entity.Usuario;
import net.cibertec.services.BusesServices;
import net.cibertec.services.HorariosServices;
import net.cibertec.services.MarcaServices;
import net.cibertec.services.RutasServices;

@Controller
@RequestMapping("/bus")
public class BusesController {

	@Autowired
	private BusesServices busesServicio;
	
	@Autowired
	private RutasServices rutasServicio;
	
	@Autowired
	private MarcaServices marcaServicio;
	
	@Autowired
	private HorariosServices horasServicio;
	@RequestMapping("/lista")
	private String lista(Model model) {
		model.addAttribute("marca",marcaServicio.listaMarcas());
		model.addAttribute("horario",horasServicio.listarHorarios());
		model.addAttribute("buse", busesServicio.listarBuses());
		return "buses";
	}
	
	
	//Cuando salga un error de hibernate con insert con nombre en los valores que no existan Alter a la table y colocar ese valor
	@RequestMapping("grabar")
	private String grabar(@RequestParam("codigo") Integer codBus,
						  @RequestParam("placa") String pla,
						  @RequestParam("añoFab") int año,
						  @RequestParam("asientos") int asiento,
						  @RequestParam("estado") String est,
						  @RequestParam("color") String col,
						  @RequestParam("marca") Integer codMar,
						  @RequestParam("horario") Integer codHora,
						  @RequestParam("final") Integer codRuta,
						  RedirectAttributes redirect) {
		try {
			Buses b = new Buses();
			b.setNroplaca(pla);
			b.setAniofab(año);
			b.setNroasi(asiento);
			b.setEstadobus(est);
			b.setColbus(col);
			
			Marca m = new Marca();
			Horarios h = new Horarios();
			Rutas r = new Rutas();
			
			m.setCodigo(codMar);
			h.setCodigo(codHora);
			r.setCodigo(codRuta);			
			
			b.setMarca(m);
			b.setHorarios(h);
			b.setRutas(r);
			if(codBus == 0) {
				busesServicio.registarBuses(b);
				redirect.addFlashAttribute("MENSAJE","Bus Registrado");
			}else {
				b.setCodigo(codBus);
				busesServicio.actualizarBuses(b);
				redirect.addFlashAttribute("MENSAJE","Bus Actualizado");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
		}
		return "redirect:/bus/lista";
	}
		
	@RequestMapping("buscar")
	@ResponseBody
	private Buses buscarUsuario(@RequestParam("codigo")  Integer cod) {
		return busesServicio.buscarBuses(cod);
	}
	
	@RequestMapping("eliminar")
	private String eliminar(@RequestParam("codigoEliminar") Integer codEli,
										  RedirectAttributes redirect) {
		busesServicio.eliminarBuses(codEli);
		redirect.addAttribute("MENSAJE","Bus Eliminado");
		return "redirect:/bus/lista";
	}
}

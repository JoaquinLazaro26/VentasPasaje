package net.cibertec.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_rutas")
public class Rutas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ruta")
	private Integer codruta;
	
	@Column(name="ruta_Inicio")
	private String rutainicio;
	
	@Column(name="ruta_Final")
	private String rutafinal;
	
	
	@OneToMany(mappedBy="rutas")
	@JsonIgnore
	private List<Buses> listaBuses;
	
	
	public Integer getCodruta() {
		return codruta;
	}
	
	
	public void setCodruta(Integer codruta) {
		this.codruta = codruta;
	}
	
	
	public String getRutainicio() {
		return rutainicio;
	}
	
	
	public void setRutainicio(String rutainicio) {
		this.rutainicio = rutainicio;
	}
	
	
	public String getRutafinal() {
		return rutafinal;
	}
	
	
	public void setRutafinal(String rutafinal) {
		this.rutafinal = rutafinal;
	}

	public List<Buses> getListaBuses() {
		return listaBuses;
	}


	public void setListaBuses(List<Buses> listaBuses) {
		this.listaBuses = listaBuses;
	}
	
}

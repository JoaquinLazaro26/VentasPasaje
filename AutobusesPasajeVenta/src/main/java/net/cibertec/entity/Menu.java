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
@Table(name="tb_menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_menucito")
	private Integer codigo;

	@Column (name="nom_men")
	private String nombre;

	@Column(name="url_men")
	private String url;

	@OneToMany(mappedBy="menu")
	@JsonIgnore
	private List<Acceso> listaAccesoMenu;

	public Integer getCodigomen() {
		return codigo;
	}

	public void setCodigomen(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Acceso> getListaAccesoMenu() {
		return listaAccesoMenu;
	}

	public void setListaAccesoMenu(List<Acceso> listaAccesoMenu) {
		this.listaAccesoMenu = listaAccesoMenu;
	}

	
}
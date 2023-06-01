package net.cibertec.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_buses")
public class Buses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_bus")
	private Integer codigo;
	
	@Column(name="nro_placa")
	private String nroplaca;
	@Column(name="año_fab")
	private int aniofab;
	@Column(name="nro_asi")
	private int nroasi;
	@Column(name="est_bus")
	private String estadobus;
	@Column(name="col_bus")
	private String colbus;
	
	@OneToMany(mappedBy="buses")
	@JsonIgnore
	private List<Pasajes> listaPasajes;
	
	
	@ManyToOne
	@JoinColumn(name="cod_mar")
	private Marca marca;// ASOCIACIÓN
	
	@ManyToOne
	@JoinColumn(name="cod_hor")
	private Horarios horarios;// ASOCIACIÓN
	
	@ManyToOne
	@JoinColumn(name="cod_ruta")
	private Rutas rutas;// ASOCIACIÓN

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNroplaca() {
		return nroplaca;
	}

	public void setNroplaca(String nroplaca) {
		this.nroplaca = nroplaca;
	}

	public int getAniofab() {
		return aniofab;
	}

	public void setAniofab(int aniofab) {
		this.aniofab = aniofab;
	}

	public int getNroasi() {
		return nroasi;
	}

	public void setNroasi(int nroasi) {
		this.nroasi = nroasi;
	}

	public String getEstadobus() {
		return estadobus;
	}

	public void setEstadobus(String estadobus) {
		this.estadobus = estadobus;
	}

	public String getColbus() {
		return colbus;
	}

	public void setColbus(String colbus) {
		this.colbus = colbus;
	}

	public List<Pasajes> getListaPasajes() {
		return listaPasajes;
	}

	public void setListaPasajes(List<Pasajes> listaPasajes) {
		this.listaPasajes = listaPasajes;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Horarios getHorarios() {
		return horarios;
	}

	public void setHorarios(Horarios horarios) {
		this.horarios = horarios;
	}

	public Rutas getRutas() {
		return rutas;
	}

	public void setRutas(Rutas rutas) {
		this.rutas = rutas;
	}


}

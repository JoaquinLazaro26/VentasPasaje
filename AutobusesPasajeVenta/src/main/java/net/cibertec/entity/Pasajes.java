package net.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pasajes")
public class Pasajes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="cod_pas")
private Integer codigopas;

@Column(name="tip_via")
private String tipovia;

@Column (name="num_asi")
private Integer numeroasi;

@Column (name="destino")
private String destino;

//relacion MUCHOS A UNO
	@ManyToOne
	@JoinColumn(name="cod_cli")
	private Cliente cliente;// ASOCIACIÓN
	
//
	@ManyToOne
	@JoinColumn(name="cod_bus")
	private Buses buses;// ASOCIACIÓN

	public Integer getCodigopas() {
		return codigopas;
	}

	public void setCodigopas(Integer codigopas) {
		this.codigopas = codigopas;
	}

	public String getTipovia() {
		return tipovia;
	}

	public void setTipovia(String tipovia) {
		this.tipovia = tipovia;
	}

	public Integer getNumeroasi() {
		return numeroasi;
	}

	public void setNumeroasi(Integer numeroasi) {
		this.numeroasi = numeroasi;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Buses getBuses() {
		return buses;
	}

	public void setBuses(Buses buses) {
		this.buses = buses;
	}

}
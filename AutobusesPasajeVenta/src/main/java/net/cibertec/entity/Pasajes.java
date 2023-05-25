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
private Integer codigo;

@Column(name="tip_via")
private String tipoVia;

@Column (name="num_asi")
private int numeroAsi;

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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public int getNumeroAsi() {
		return numeroAsi;
	}

	public void setNumeroAsi(int numeroAsi) {
		this.numeroAsi = numeroAsi;
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
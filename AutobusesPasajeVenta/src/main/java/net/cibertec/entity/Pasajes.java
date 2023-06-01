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
	
	@Column(name="monto")
	private Double monto;
	
	//relacion MUCHOS A UNO
	@ManyToOne
	@JoinColumn(name="cod_cliente")
	private Cliente cliente;// ASOCIACIÓN
	
	//
	@ManyToOne
	@JoinColumn(name="cod_bus")
	private Buses buses;// ASOCIACIÓN

	@ManyToOne
	@JoinColumn(name="cod_asiento")
	private Asiento asiento ;// ASOCIACIÓN

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
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

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
}
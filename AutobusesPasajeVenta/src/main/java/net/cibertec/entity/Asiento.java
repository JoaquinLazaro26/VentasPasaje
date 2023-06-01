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
@Table(name="tb_asiento")
public class Asiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_asi")
	private Integer codigo;
	@Column (name="nro_asiento")
	private int numeroAsi;
	
	@ManyToOne
	@JoinColumn(name="cod_tipo_asiento")
	private TipoAsiento tipoAsiento;
	
	@OneToMany(mappedBy = "asiento")
	@JsonIgnore
	private List<Pasajes> listaPasajes;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public int getNumeroAsi() {
		return numeroAsi;
	}

	public void setNumeroAsi(int numeroAsi) {
		this.numeroAsi = numeroAsi;
	}

	public TipoAsiento getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(TipoAsiento tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

	public List<Pasajes> getListaPasajes() {
		return listaPasajes;
	}

	public void setListaPasajes(List<Pasajes> listaPasajes) {
		this.listaPasajes = listaPasajes;
	}
	
	
}

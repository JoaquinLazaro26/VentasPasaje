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
@Table(name="tb_tipo_asiento")
public class TipoAsiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_asi")
	private Integer codigo;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private double precio;
	
	@OneToMany(mappedBy = "tipoAsiento")
	@JsonIgnore
	private List<Asiento> listaAsientos;
}

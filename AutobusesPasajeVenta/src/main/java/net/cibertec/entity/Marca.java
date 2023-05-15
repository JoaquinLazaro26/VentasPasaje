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
@Table(name="tb_marca")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_mar")
	private Integer codigo;
	
	@Column (name="nom_mar")
	private String nombre;
	
	@OneToMany(mappedBy="marca")
	@JsonIgnore
	private List<Buses> listaMarca;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNombremarca() {
		return nombre;
	}
	
	public void setNombremarca(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Buses> getListaMarca() {
		return listaMarca;
	}
	
	public void setListaMarca(List<Buses> listaMarca) {
		this.listaMarca = listaMarca;
	}

}
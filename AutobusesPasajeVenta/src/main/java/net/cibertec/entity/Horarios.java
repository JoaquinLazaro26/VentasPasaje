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
@Table(name="tb_horarios")
public class Horarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_hor")
	private Integer codigo;
	
	@Column (name="horas")
	private String horas;
	
	@OneToMany(mappedBy="horarios")
	@JsonIgnore
	private List<Buses> listaBusesHorario;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getHoras() {
		return horas;
	}
	
	public void setHoras(String horas) {
		this.horas = horas;
	}
	
	public List<Buses> getListaBusesHorario() {
		return listaBusesHorario;
	}

	public void setListaBusesHorario(List<Buses> listaBusesHorario) {
		this.listaBusesHorario = listaBusesHorario;
	}

}
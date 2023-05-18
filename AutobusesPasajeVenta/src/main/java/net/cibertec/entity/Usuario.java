package net.cibertec.entity;

import java.time.LocalDate;
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
@Table(name="tb_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_usu")
	private Integer codigocli;

	@Column (name="log_usu")
	private String logusu;

	@Column (name="pas_usu")
	private String passusu;

	@Column(name="nom_usus")
	private String nombreusu;
	
	@Column(name="ape_usu")
	private String apellidousu;
	
	@Column(name="cel_usu")
	private String celularusu;

	@Column(name="dni_usu")
	private String dniusu;

	@Column(name="fecNaci")
	private LocalDate fecha;

	@Column (name="correo")
	private Integer correo;
	
	@Column (name="sex_usu")
	private String sexo;

	@ManyToOne
	@JoinColumn(name="cod_ubi")
	private Ubigeo ubigeoUsuario;// ASOCIACIÓN
	//
	//
	@ManyToOne
	@JoinColumn(name="cod_car")
	private Cargo cargo;// ASOCIACIÓN


	public Integer getCodigocli() {
		return codigocli;
	}


	public void setCodigocli(Integer codigocli) {
		this.codigocli = codigocli;
	}


	public String getLogusu() {
		return logusu;
	}


	public void setLogusu(String logusu) {
		this.logusu = logusu;
	}


	public String getPassusu() {
		return passusu;
	}


	public void setPassusu(String passusu) {
		this.passusu = passusu;
	}


	public String getNombreusu() {
		return nombreusu;
	}


	public void setNombreusu(String nombreusu) {
		this.nombreusu = nombreusu;
	}


	public String getApellidousu() {
		return apellidousu;
	}


	public void setApellidousu(String apellidousu) {
		this.apellidousu = apellidousu;
	}


	public String getCelularusu() {
		return celularusu;
	}


	public void setCelularusu(String celularusu) {
		this.celularusu = celularusu;
	}


	public String getDniusu() {
		return dniusu;
	}


	public void setDniusu(String dniusu) {
		this.dniusu = dniusu;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Integer getCorreo() {
		return correo;
	}


	public void setCorreo(Integer correo) {
		this.correo = correo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




}
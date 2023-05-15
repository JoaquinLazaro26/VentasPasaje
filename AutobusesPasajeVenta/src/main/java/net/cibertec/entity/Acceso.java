package net.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="tb_acceso")
public class Acceso {

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name="cod_usu")
	private Usuario usuario;// ASOCIACIÓN
	
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name="cod_men")
	private Menu menu;// ASOCIACIÓN

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}

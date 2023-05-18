package net.cibertec.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class CargoMenuPK implements Serializable{

	//para la llave primaria compuesta
	private int id_car;
	private int id_men;
	
	public int getId_car() {
		return id_car;
	}
	public void setId_car(int id_car) {
		this.id_car = id_car;
	}
	public int getId_men() {
		return id_men;
	}
	public void setId_men(int id_men) {
		this.id_men = id_men;
	}
	
	//hashCode --> Genera una clave en funcion a los atributos de la clase actual
	//equals --> Valida la clave generada
	@Override
	public int hashCode() {
		return Objects.hash(id_car, id_men);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoMenuPK other = (CargoMenuPK) obj;
		return id_car == other.id_car && id_men == other.id_men;
	}
	
	
}

package co.equipo6.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonas")
public class Zona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idzonas")
	private Integer idZonas;

	@Column(name = "nombre_zona")
	private String nombreZona;

	@Column(name = "capacidad")
	private String capacidad;

	@Column(name = "ocupacion")
	private String ocupacion;

	public Integer getIdZonas() {
		return idZonas;
	}

	public void setIdZonas(Integer idZonas) {
		this.idZonas = idZonas;
	}

	public String getNombreZona() {
		return nombreZona;
	}

	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Zona [idZonas=" + idZonas + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", ocupacion="
				+ ocupacion + "]";
	}

}

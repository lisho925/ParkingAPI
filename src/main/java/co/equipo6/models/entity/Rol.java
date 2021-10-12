package co.equipo6.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@Column(name="idroles")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idRoles;
	
	@Column(name="nombre_rol")
	private String nombreRol;

	public Integer getIdRoles() {
		return idRoles;
	}

	public void setIdRoles(Integer idRoles) {
		this.idRoles = idRoles;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	@Override
	public String toString() {
		return "Rol [idRoles=" + idRoles + ", nombreRol=" + nombreRol + "]";
	}

	
}

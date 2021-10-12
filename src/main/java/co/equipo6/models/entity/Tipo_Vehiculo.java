package co.equipo6.models.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_Vehiculo")
public class Tipo_Vehiculo {
	@Id
	@Column(name = "idvehiculo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idVehiculo;

	@Column(name = "tipo_vehiculo")
	private String claseVehiculo;

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getClaseVehiculo() {
		return claseVehiculo;
	}

	public void setClaseVehiculo(String claseVehiculo) {
		this.claseVehiculo = claseVehiculo;
	}

	@Override
	public String toString() {
		return "Tipo_Vehiculo [idVehiculo=" + idVehiculo + ", claseVehiculo=" + claseVehiculo + "]";
	}

	
}

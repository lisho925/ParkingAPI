package co.equipo6.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarifas")
public class Tarifa {
	@Id
	@Column(name = "idtarifas")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTarifas;

	@ManyToOne
	@JoinColumn(name = "tipovehiculo_tarifas")
	private Tipo_Vehiculo tipoVehiculoTarifas;

	@Column(name = "periodo")
	private String periodo;

	@Column(name = "tarifa")
	private String tarifa;

	public Integer getIdTarifas() {
		return idTarifas;
	}

	public void setIdTarifas(Integer idTarifas) {
		this.idTarifas = idTarifas;
	}

	public Tipo_Vehiculo getTipoVehiculoTarifas() {
		return tipoVehiculoTarifas;
	}

	public void setTipoVehiculoTarifas(Tipo_Vehiculo tipoVehiculoTarifas) {
		this.tipoVehiculoTarifas = tipoVehiculoTarifas;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Tarifa [idTarifas=" + idTarifas + ", tipoVehiculoTarifas=" + tipoVehiculoTarifas + ", periodo="
				+ periodo + ", tarifa=" + tarifa + "]";
	}

	
}

package co.equipo6.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@Column(name = "idcliente")
	private Integer idCliente;

	@Column(name = "placa_cliente")
	private String placaCliente;

	@ManyToOne
	@JoinColumn(name = "tipovehiculo_cliente")
	private Tipo_Vehiculo tipoVehiculoCliente;

	@Column(name = "tarifa_cliente")
	private Integer tarifa;

	@Column(name = "nombre_cliente")
	private String nombreCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getPlacaCliente() {
		return placaCliente;
	}

	public void setPlacaCliente(String placaCliente) {
		this.placaCliente = placaCliente;
	}

	public Tipo_Vehiculo getTipoVehiculoCliente() {
		return tipoVehiculoCliente;
	}

	public void setTipoVehiculoCliente(Tipo_Vehiculo tipoVehiculoCliente) {
		this.tipoVehiculoCliente = tipoVehiculoCliente;
	}

	public Integer getTarifa() {
		return tarifa;
	}

	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", placaCliente=" + placaCliente + ", tipoVehiculoCliente="
				+ tipoVehiculoCliente + ", tarifa=" + tarifa + ", nombreCliente=" + nombreCliente + "]";
	}

	
}

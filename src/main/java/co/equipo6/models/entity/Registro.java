package co.equipo6.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="registros")
public class Registro {
	@Id
	@Column(name="idregistro")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idRegistro;
	
	@Column(name="placa")
	private String Placa;
	
	@Column(name="horaingreso")
	private Date horaIngreso;
	
	@ManyToOne
	@JoinColumn(name="tipovehiculo_registro")
	private Tipo_Vehiculo tipoVehiculoRegistro;
	
	@ManyToOne
	@JoinColumn(name="zona")
	private Zona zona;
	
	@Column(name="horasalida")
	private Date horaSalida;
	
	@Column(name="valor")
	private Integer valor;
	
	@ManyToOne
	@JoinColumn(name="tipopago_registro")
	private Forma_Pago tipoPagoRegistro;
	
	@ManyToOne
	@JoinColumn(name="usuario_registro")
	private Usuario usuarioRegistro;

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public Date getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public Tipo_Vehiculo getTipoVehiculoRegistro() {
		return tipoVehiculoRegistro;
	}

	public void setTipoVehiculoRegistro(Tipo_Vehiculo tipoVehiculoRegistro) {
		this.tipoVehiculoRegistro = tipoVehiculoRegistro;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Forma_Pago getTipoPagoRegistro() {
		return tipoPagoRegistro;
	}

	public void setTipoPagoRegistro(Forma_Pago tipoPagoRegistro) {
		this.tipoPagoRegistro = tipoPagoRegistro;
	}

	public Usuario getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(Usuario usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	@Override
	public String toString() {
		return "Registro [idRegistro=" + idRegistro + ", Placa=" + Placa + ", horaIngreso=" + horaIngreso
				+ ", tipoVehiculoRegistro=" + tipoVehiculoRegistro + ", zona=" + zona + ", horaSalida=" + horaSalida
				+ ", valor=" + valor + ", tipoPagoRegistro=" + tipoPagoRegistro + ", usuarioRegistro=" + usuarioRegistro
				+ "]";
	}
		
}

package co.equipo6.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formas_pago")
public class Forma_Pago {
	@Id
	@Column(name = "idformas_pago")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFormaPago;

	@Column(name = "forma_pago")
	private String formaPago;

	public Integer getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(Integer idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	@Override
	public String toString() {
		return "Forma_Pago [idFormaPago=" + idFormaPago + ", formaPago=" + formaPago + "]";
	}
	
}

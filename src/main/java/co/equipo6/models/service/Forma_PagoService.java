package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Forma_Pago;

public interface Forma_PagoService {
	public List<Forma_Pago>findAll();
	public Optional<Forma_Pago>findById(Integer id);
	public Forma_Pago save(Forma_Pago formapago);
	public void deleteById(Integer id);
}

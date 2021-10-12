package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Registro;

public interface RegistroService {
	public List<Registro>findAll();
	public Optional<Registro>findById(Integer id);
	public Registro save(Registro registro);
	public void deleteById(Integer id);
	
}

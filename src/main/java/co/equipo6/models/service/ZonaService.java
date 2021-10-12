package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Zona;

public interface ZonaService {
	public List<Zona>findAll();
	public Optional<Zona>findById(Integer id);
	public Zona save(Zona zona);
	public void deleteById(Integer id);
}

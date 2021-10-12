package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Tarifa;

public interface TarifaService {
	public List<Tarifa>findAll();
	public Optional<Tarifa>findById(Integer id);
	public Tarifa save(Tarifa tarifa);
	public void deleteById(Integer id);
}

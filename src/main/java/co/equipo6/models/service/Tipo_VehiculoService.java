package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Tipo_Vehiculo;

public interface Tipo_VehiculoService {
	public List<Tipo_Vehiculo>findAll();
	public Optional<Tipo_Vehiculo>findById(Integer id);
	public Tipo_Vehiculo save(Tipo_Vehiculo tipoVehiculo);
	public void deleteById(Integer id);
}

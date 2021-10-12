package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Rol;

public interface RolService {
	public List<Rol>findAll();
	public Optional<Rol>findById(Integer id);
	public Rol save(Rol rol);
	public void deleteById(Integer id);
}

package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import co.equipo6.models.entity.Cliente;

public interface ClienteService {
	public List<Cliente>findAll();
	public Optional<Cliente>findById(Integer id);
	public Cliente save(Cliente cliente);
	public void deleteById(Integer id);
}

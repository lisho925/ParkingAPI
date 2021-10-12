package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Rol;
import co.equipo6.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{
	@Autowired
	public RolRepository rolRepository;

	@Override
	public List<Rol> findAll() {
		return rolRepository.findAll();
	}

	@Override
	public Optional<Rol> findById(Integer id) {
		return rolRepository.findById(id);
	}

	@Override
	public Rol save(Rol rol) {
		return rolRepository.save(rol);
	}

	@Override
	public void deleteById(Integer id) {
		rolRepository.deleteById(id);
		
	} 
	
}

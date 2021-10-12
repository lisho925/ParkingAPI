package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Zona;
import co.equipo6.repository.ZonaRepository;

@Service
public class ZonasServiceImpl implements ZonaService{

	@Autowired
	public ZonaRepository zonareRepository;
	
	@Override
	public List<Zona> findAll() {
		return zonareRepository.findAll();
	}

	@Override
	public Optional<Zona> findById(Integer id) {
		return zonareRepository.findById(id);
	}

	@Override
	public Zona save(Zona zona) {
		return zonareRepository.save(zona);
	}

	@Override
	public void deleteById(Integer id) {
		zonareRepository.deleteById(id);
		
		
	}

}

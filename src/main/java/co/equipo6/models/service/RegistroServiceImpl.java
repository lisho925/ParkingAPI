package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Registro;
import co.equipo6.repository.RegistroRepository;

@Service
public class RegistroServiceImpl implements RegistroService{

	@Autowired
	public RegistroRepository registroRepository;
	
	@Override
	public List<Registro> findAll() {
		return registroRepository.findAll();
	}

	@Override
	public Optional<Registro> findById(Integer id) {
		return registroRepository.findById(id);
	}

	@Override
	public Registro save(Registro registro) {
		return registroRepository.save(registro);
	}

	@Override
	public void deleteById(Integer id) {
		registroRepository.deleteById(id);
		
	}

}

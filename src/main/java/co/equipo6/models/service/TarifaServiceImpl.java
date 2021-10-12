package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Tarifa;
import co.equipo6.repository.TarifaRepository;

@Service
public class TarifaServiceImpl implements TarifaService{
	@Autowired
	public TarifaRepository tarifaRepository;
	
	@Override
	public List<Tarifa> findAll() {
		return tarifaRepository.findAll();
	}

	@Override
	public Optional<Tarifa> findById(Integer id) {
		return tarifaRepository.findById(id);
	}

	@Override
	public Tarifa save(Tarifa tarifa) {
		return tarifaRepository.save(tarifa);
	}

	@Override
	public void deleteById(Integer id) {
		tarifaRepository.deleteById(id);
		
	}

}

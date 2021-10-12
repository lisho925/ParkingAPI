package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Forma_Pago;
import co.equipo6.repository.Forma_PagoRepository;

@Service
public class Forma_PagoServiceImpl implements Forma_PagoService {

	@Autowired
	public Forma_PagoRepository forma_PagoRepository;
	
	@Override
	public List<Forma_Pago> findAll() {
		return forma_PagoRepository.findAll();
	}

	@Override
	public Optional<Forma_Pago> findById(Integer id) {
		return forma_PagoRepository.findById(id);
	}

	@Override
	public Forma_Pago save(Forma_Pago formapago) {
		return forma_PagoRepository.save(formapago);
	}

	@Override
	public void deleteById(Integer id) {
		forma_PagoRepository.deleteById(id);
	}

}

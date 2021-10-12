package co.equipo6.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.equipo6.models.entity.Tipo_Vehiculo;
import co.equipo6.repository.Tipo_VehiculoRepository;

@Service
public class Tipo_VehiculoServiceImpl implements Tipo_VehiculoService{
	@Autowired
	public Tipo_VehiculoRepository tipo_VehiculoRepository;
	
	@Override
	public List<Tipo_Vehiculo> findAll() {
		return tipo_VehiculoRepository.findAll();
	}

	@Override
	public Optional<Tipo_Vehiculo> findById(Integer id) {
		return tipo_VehiculoRepository.findById(id);
	}

	@Override
	public Tipo_Vehiculo save(Tipo_Vehiculo tipoVehiculo) {
		return tipo_VehiculoRepository.save(tipoVehiculo);
	}

	@Override
	public void deleteById(Integer id) {
		tipo_VehiculoRepository.deleteById(id);
				
	}
	

}

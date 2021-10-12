package co.equipo6.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.equipo6.models.entity.Tipo_Vehiculo;
import co.equipo6.models.service.Tipo_VehiculoService;

@RestController
@RequestMapping("api/tipoVehiculo")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class Tipo_VehiculoController {
	
	@Autowired
	private Tipo_VehiculoService tipo_VehiculoService;

	@GetMapping("{id}")
	public Optional<Tipo_Vehiculo> buscarPorId(@PathVariable Integer id){
		return tipo_VehiculoService.findById(id);
	} 

	@GetMapping("/listar")
	public List<Tipo_Vehiculo> listar(){
		return tipo_VehiculoService.findAll();
	}
		
	@PostMapping
	public Tipo_Vehiculo  guardar(@RequestBody Tipo_Vehiculo tipo_Vehiculo) {
		return tipo_VehiculoService.save(tipo_Vehiculo);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		tipo_VehiculoService.deleteById(id);
	}
	
	@PutMapping ("/actualizar/{id}")
	public Tipo_Vehiculo actualizar(@RequestBody Tipo_Vehiculo tipo_Vehiculo , @PathVariable Integer id) {
		Tipo_Vehiculo vAct= tipo_VehiculoService.findById(id).get();
		vAct.setClaseVehiculo(tipo_Vehiculo.getClaseVehiculo());
		return tipo_VehiculoService.save(vAct);
	}
	
}

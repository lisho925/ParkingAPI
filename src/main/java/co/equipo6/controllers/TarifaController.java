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

import co.equipo6.models.entity.Tarifa;
import co.equipo6.models.service.TarifaService;

@RestController
@RequestMapping("api/tarifa")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class TarifaController {
	
	@Autowired
	private TarifaService tarifaService;
	
	@GetMapping("{id}")
	public Optional<Tarifa> buscarPorId(@PathVariable Integer id){
		return tarifaService.findById(id);
	}

	@GetMapping("/listar")
	public List<Tarifa> listar(){
		return tarifaService.findAll();
	}
	
	@PostMapping
	public Tarifa guardar(@RequestBody Tarifa tarifa) {
		return tarifaService.save(tarifa);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		tarifaService.deleteById(id);
	}

	@PutMapping ("/actualizar/{id}")
	public Tarifa actualizar(@RequestBody Tarifa tarifa , @PathVariable Integer id) {
		Tarifa vAct= tarifaService.findById(id).get();
		vAct.setPeriodo(tarifa.getPeriodo());
		vAct.setTarifa(tarifa.getTarifa());
		vAct.setTipoVehiculoTarifas(tarifa.getTipoVehiculoTarifas());
		return tarifaService.save(vAct);
	}
	

}

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

import co.equipo6.models.entity.Zona;
import co.equipo6.models.service.ZonaService;

@RestController
@RequestMapping("api/zona")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class ZonaController {
	
	@Autowired
	private ZonaService zonaService;
	
	@GetMapping("{id}")
	public Optional<Zona> buscarPorId(@PathVariable Integer id){
		return zonaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Zona> listar(){
		return zonaService.findAll();
	}

	@PostMapping
	public Zona guardar(@RequestBody Zona zona) {
		return zonaService.save(zona);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		zonaService.deleteById(id);
	}
	
	@PutMapping ("/actualizar/{id}")
	public Zona actualizar(@RequestBody Zona zona , @PathVariable Integer id) {
		Zona vAct= zonaService.findById(id).get();
		vAct.setCapacidad(zona.getCapacidad());
		vAct.setNombreZona(zona.getNombreZona());
		vAct.setOcupacion(zona.getOcupacion());
		return zonaService.save(vAct);
	} 
	
}

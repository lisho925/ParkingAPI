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

import co.equipo6.models.entity.Rol;
import co.equipo6.models.service.RolService;

@RestController
@RequestMapping("api/rol")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class RolController {
	@Autowired
	private RolService rolService;
	
	@GetMapping("{id}")
	public Optional<Rol> buscarPorId(@PathVariable Integer id){
		return rolService.findById(id);
	}

	@GetMapping("/listar")
	public List<Rol> listar(){
		return rolService.findAll();
	}
	
	@PostMapping
	public Rol guardar(@RequestBody Rol forma_Pago) {
		return rolService.save(forma_Pago);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		rolService.deleteById(id);
	}

	@PutMapping ("/actualizar/{id}")
	public Rol actualizar(@RequestBody Rol rol , @PathVariable Integer id) {
		Rol vAct= rolService.findById(id).get();
		vAct.setNombreRol(rol.getNombreRol());
		return rolService.save(vAct);
	}
	
}

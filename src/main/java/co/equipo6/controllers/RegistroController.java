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

import co.equipo6.models.entity.Registro;
import co.equipo6.models.service.RegistroService;

@RestController
@RequestMapping("api/registro")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class RegistroController {
	@Autowired
	private RegistroService registroService;
	
	@GetMapping("{id}")
	public Optional<Registro> buscarPorId(@PathVariable Integer id){
		return registroService.findById(id);
	}

	@GetMapping("/listar")
	public List<Registro> listar(){
		return registroService.findAll();
	}
	
	@PostMapping
	public Registro guardar(@RequestBody Registro Registro) {
		return registroService.save(Registro);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		registroService.deleteById(id);		
	}
		
	@PutMapping ("/actualizar/{id}")
	public Registro actualizar(@RequestBody Registro registro  , @PathVariable Integer id) {
		Registro vAct= registroService.findById(id).get();
		vAct.setPlaca(registro.getPlaca());
		vAct.setHoraIngreso(registro.getHoraIngreso());
		vAct.setTipoVehiculoRegistro(registro.getTipoVehiculoRegistro());
		vAct.setZona(registro.getZona());
		vAct.setHoraSalida(registro.getHoraSalida());
		vAct.setValor(registro.getValor());
		vAct.setTipoPagoRegistro(registro.getTipoPagoRegistro());
		vAct.setUsuarioRegistro(registro.getUsuarioRegistro());
		return registroService.save(vAct);
	}
	
}

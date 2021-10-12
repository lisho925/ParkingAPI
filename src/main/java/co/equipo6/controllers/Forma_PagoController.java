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

import co.equipo6.models.entity.Forma_Pago;
import co.equipo6.models.service.Forma_PagoService;

@RestController
@RequestMapping("api/formaPago")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class Forma_PagoController {
	@Autowired
	private Forma_PagoService forma_PagoService;
	
	@GetMapping("{id}")
	public Optional<Forma_Pago> buscarPorId(@PathVariable Integer id){
		return forma_PagoService.findById(id);
	}

	@GetMapping("/listar")
	public List<Forma_Pago> listar(){
		return forma_PagoService.findAll();
	}
	
	@PostMapping
	public Forma_Pago guardar(@RequestBody Forma_Pago forma_Pago) {
		return forma_PagoService.save(forma_Pago);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		forma_PagoService.deleteById(id);
	}

	@PutMapping ("/actualizar/{id}")
	public Forma_Pago actualizar(@RequestBody Forma_Pago forma_Pago , @PathVariable Integer id) {
		Forma_Pago vAct= forma_PagoService.findById(id).get();
		vAct.setFormaPago(forma_Pago.getFormaPago());
		return forma_PagoService.save(vAct);
	}
	
}

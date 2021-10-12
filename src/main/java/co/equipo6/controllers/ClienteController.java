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

import co.equipo6.models.entity.Cliente;
import co.equipo6.models.service.ClienteService;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@GetMapping("{id}")
	public Optional<Cliente> buscarPorId(@PathVariable Integer id){
		return clienteService.findById(id);
	} 

	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	
	@PostMapping
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		clienteService.deleteById(id);
	}
	
	@PutMapping ("/actualizar/{id}")
	public Cliente actualizar(@RequestBody Cliente cliente , @PathVariable Integer id) {
		Cliente vAct=clienteService.findById(id).get();
		vAct.setNombreCliente(cliente.getNombreCliente());
		vAct.setPlacaCliente(cliente.getPlacaCliente());
		vAct.setTarifa(cliente.getTarifa());
		vAct.setTipoVehiculoCliente(cliente.getTipoVehiculoCliente());
		return clienteService.save(vAct);
	}
	
}

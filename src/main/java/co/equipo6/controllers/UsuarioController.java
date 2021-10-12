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


import co.equipo6.models.entity.Usuario;
import co.equipo6.models.service.UsuarioService;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin(origins="*",methods= {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Integer id){
		return usuarioService.findById(id);
	}

	@GetMapping("/listar")
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.deleteById(id);		
	}
		
	@PutMapping ("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario  , @PathVariable Integer id) {
		Usuario vAct= usuarioService.findById(id).get();
		vAct.setNombre(usuario.getNombre());
		vAct.setApellidos(usuario.getApellidos());
		vAct.setTelefono(usuario.getTelefono());
		vAct.setDireccion(usuario.getDireccion());
		vAct.setTipoUsuario(usuario.getTipoUsuario());
		vAct.setUser(usuario.getUser());
		vAct.setPassword(usuario.getPassword());
	    return usuarioService.save(vAct);
	}
		
}

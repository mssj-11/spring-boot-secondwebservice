package com.bolsadeideas.springboot.secondwebservice.usuario.app;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController		//	Controlador de tipo REST
@RequestMapping("/usuarios")	//	Ruta RAIZ
public class UsuarioController {
	
	//	Inyeccion de Dependencia UsuarioServicio
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	
	/*	Metodos	*/
	//	Mostrar Usuarios
	@GetMapping
	//	Devolviendo una Lista de Usuarios(UsuarioTodos)
	public List<UsuarioTodos> buscarTodos(@RequestParam(required=false) String filtro){
		return usuarioServicio.buscarTodos();
	}
	
	
	//	Crear Usuario
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)	//	Indicando si se a creado el Usuario
	public void crearUsuario(@RequestBody UsuarioTodos usuario) {
		usuarioServicio.crear(usuario);
	}
	
	
	//	Buscar Usuario por ID
	@GetMapping("/{usuarioId}")	//	Variable(usuarioId) de tipo RUTA
	public UsuarioTodos buscarPorId(@PathVariable UUID usuarioId) {
		return usuarioServicio.buscarPorId(usuarioId);
	}
	
	
}
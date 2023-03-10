package com.bolsadeideas.springboot.secondwebservice.usuario.app;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
	
	//	Simulando la DB interna/local con HashMap
	private final Map<UUID, UsuarioTodos> usuarios = new HashMap<>();
	
	
	/*	Metododos	*/
	
	public UsuarioTodos crear(final UsuarioTodos usuario) {
		return usuarios.put(UUID.randomUUID(), usuario);
	}
	
	
	public UsuarioTodos buscarPorId(final UUID id) {
		return usuarios.get(id);
	}
	
	
	public List<UsuarioTodos> buscarTodos(){
		return usuarios.keySet().stream()
				.map(usuarios::get)
				.toList();
	}
	
	
	public void eliminar(final UUID id) {
		usuarios.remove(id);
	}
	
	
}
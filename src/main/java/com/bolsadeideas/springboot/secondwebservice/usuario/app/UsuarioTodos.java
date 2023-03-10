package com.bolsadeideas.springboot.secondwebservice.usuario.app;

import java.util.Objects;


public class UsuarioTodos {
	
	//	Atributos
	private String nombre;
	
	
	//	Constructor vacio
	public UsuarioTodos() {
	}


	//	Constructor
	public UsuarioTodos(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
	//	Getter and Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		UsuarioTodos that = (UsuarioTodos) obj;
		return Objects.equals(nombre, that.nombre);
	}
	
	
	
}
package com.coderhouse.entidades;

import com.coderhouse.interfaces.SerVivoInterface;

public class Ave implements SerVivoInterface{//Implementa la interface de servivo
	
	private String nombre;//Una vez generando el nombre podemos hacer los getter y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void emitirSonido() {}

	@Override
	public void moverse() {
		System.out.println(getNombre()+" se esta moviendo.!");//ahora existe dentro de ave
	}

	@Override
	public void comer() {}

	@Override
	public boolean estaVivo() {	
		return false;
	}

	
}

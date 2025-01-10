package com.coderhouse;

import com.coderhouse.mascotas.Mascota;
import com.coderhouse.mascotas.Perro;

public class Main {

	public static void main(String[] args) throws PerroException {
		
		Perro unPerro = new Perro();//CONSTRUCTOR PERRO
		
		//Heredamos todos los atributos y metodos de la clase padre 
		unPerro.setNombre("Pinto");
		unPerro.setColor("Lila");
		unPerro.setTamanio("Chico");
		try {//tira un mensaje
			unPerro.setEdad(2);
		}catch(PerroException err) {
			System.err.println("Error, " + err.getMessage());
		}finally {
			System.out.println("Finalizo la validacion de la perroexception");
		}
		unPerro.setRaza("pitbull");
		
		
		unPerro.caminar();
		unPerro.comer();
		unPerro.ladrar();
		
		System.out.println(unPerro);

		Mascota unaMascota = new Mascota();
		unaMascota.setNombre("Rex");
		unaMascota.setColor("Blanco");
		unaMascota.setTamanio("Grande");
		unaMascota.setEdad(6);
		
		unaMascota.caminar();
		unaMascota.comer();
		
		Mascota nuevaMascota = new Mascota("BELICA", "Negro", "Mediano",6);
		nuevaMascota.caminar();
		nuevaMascota.comer();
		
	}

}

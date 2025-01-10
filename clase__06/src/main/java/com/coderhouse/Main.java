package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;

public class Main {

	public static void main(String[] args) {
		//HAREMOS UNA INSTANCIA DE PERRO
		
		Perro miPerro = new Perro();//Mi perro que hereda de la clase ANIMAL
		
		miPerro.setNombre("Pinto");
		miPerro.setEdad(5);
		miPerro.setRaza("Hosku");
		miPerro.setVivo(true);
		
		miPerro.comer();
		miPerro.emitirSonido();
		miPerro.estaVivo();
		miPerro.comer();
		miPerro.dormir();
		miPerro.jugar();
		miPerro.respirar();
//		
//		System.out.println("El perro " +miPerro.getNombre()+ "esta vivo? :"+miPerro.estaVivo());
//
//		System.out.println(miPerro);
//		System.out.println(" La ubicacion de: " + miPerro.getNombre() 
//		+ " es en " +SerVivoInterface.Ubicacion);
//		
//		Gato miGato = new Gato();
//		miGato.setNombre("MICHI");
//		miGato.comer();
//		miGato.emitirSonido();
//		miGato.estaVivo();
//		miGato.comer();
//		miGato.dormir();
//		miGato.jugar();
//		
//		System.out.println(miGato);
//		
//		Ave miAve = new Ave();
//		miAve.comer();
//		miAve.emitirSonido();
//		miAve.estaVivo();
//		miAve.setNombre("Twiteee");
//		miAve.moverse();
//		
//		Auto miAuto = new Auto();
//		miAuto.setMarca("Ford");
//		miAuto.setModelo("Fiesta");
//		miAuto.setRuedas(4);
//		miAuto.setColor("Azul");
//		miAuto.mostrarCantRuedas();
//		System.out.println(miAuto);
	

	}

}

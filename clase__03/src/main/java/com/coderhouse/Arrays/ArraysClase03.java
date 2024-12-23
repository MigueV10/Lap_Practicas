package com.coderhouse.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class ArraysClase03 {

	public static void main(String[] args) {
		
		int[] numerosEnteros = new int[6];
		numerosEnteros [0]=10; // estoy guardando en la posicion 0, el num 10 
		
		numerosEnteros [1]=34;
		numerosEnteros [2]=13;
		numerosEnteros [3]=123;
		numerosEnteros [4]=11;
		numerosEnteros [5]=57;
//		
//		System.out.println("posicion en memoria:" + numerosEnteros);
//		System.out.println("El array numerosEnteros tiene:"
//		+ numerosEnteros.length + " Elementos.!");
//		System.out.println("El elemento con indice 0 es: " + numerosEnteros[0]);
//		System.out.println("El elemento con indice 1 es: " + numerosEnteros[1]);
//		System.out.println("El elemento con indice 2 es: " + numerosEnteros[2]);
//		System.out.println("El elemento con indice 3 es: " + numerosEnteros[3]);
//		System.out.println("El elemento con indice 4 es: " + numerosEnteros[4]);
//		System.out.println("El elemento con indice 5 es: " + numerosEnteros[5]);

		//System.out.println(Arrays.toString(numerosEnteros));//lo convierto en formato string para armar el array!
//		String [] palabras = {
//				"Hola","Mundo","Coder"
//		};
//		
//		System.out.println("Muestrame las palabras mostradas:" +palabras.length+ " Palabras");
//		System.out.println(Arrays.toString(palabras));
		
		//LISTAS. es una interfaz que extiende su compartamiento, representa un grupo
		//list es una interfaz de java, paquete util, define un comportamiento general de las listas
		//Arrays list: es una clase concreta
		
		
		List<String> listaDeNombres= new ArrayList<>();
//		List<String> listaDeNombres2= new ArrayList<>();

		listaDeNombres.add("Miguel");//0
		listaDeNombres.add("Rober");//1
		listaDeNombres.add("Gelo");//2
		listaDeNombres.add("Marce");//3
		
//		listaDeNombres2.add("Meli");//0 > 4
//		listaDeNombres2.add("Nicole");//1 > 5
//		
//		listaDeNombres.addAll(listaDeNombres2);
		
//		System.out.println("El array lista tiene: " 
//		+listaDeNombres.size()+ " elementos");//permite la cant de elementos que tiene una lista.
//		
//
//		System.out.println("La lista lista de nombres contiene a listadenombres2 "
//				+listaDeNombres.containsAll(listaDeNombres2));// me devuelve true o false si la lista esta contenida dentro de list1
//		System.out.println(listaDeNombres);
//		
//		listaDeNombres.remove(4);// SE ELIMINA MARCELO POR QUE ES EL INDICE 3
//		System.out.println(listaDeNombres);

		
//		System.out.println("El array lista tiene: " 
//				+listaDeNombres.size()+ " elementos");
//		System.out.println(listaDeNombres);
		
		
		
//		listaDeNombres.removeAll(listaDeNombres2);
//		System.out.println("El array lista tiene: " 
//		+listaDeNombres.size()+ " elementos");//permite la cant de elementos que tiene una lista.
//		
//		System.out.println("La lista lista de nombres contiene a listadenombres2 "
//				+listaDeNombres.containsAll(listaDeNombres2));
		
		
		//FOR-EACH 
//		for(String nombre : listaDeNombres) {//por cada nombre de lista de nombres vas a imprimir los nombres
//		System.out.println("Nombre: "+nombre);
//		}
		
//		System.out.println(listaDeNombres.isEmpty());//me devuelve un booleano/FALSE
//		System.out.println(listaDeNombres);

		//listaDeNombres.removeAll(listaDeNombres);
//		listaDeNombres.clear();//vaciar la lista
		
//		if(listaDeNombres.isEmpty() ) {
//			System.out.println("La lista esta vacia!!");
//		}else {
//			System.out.println(listaDeNombres);
//		}
		
//		System.out.println(listaDeNombres);
//		int posicion = 4;
//		System.out.println("El elemento con la posicion NRO "+ posicion+ " es:"
//				+listaDeNombres.get(posicion));
//		listaDeNombres.set(posicion,"Gelo");
//		System.out.println(listaDeNombres);
//
//		System.out.println("El elemento con la posicion NRO "+ posicion+ " es:"
//				+listaDeNombres.get(posicion));
//		
//		String nombre = "Gelo";
//		System.out.println("El indice del nombre "+ nombre + " es:"
//				+ listaDeNombres.indexOf(nombre));
//		do {
//			System.out.println("Al menos 1 vez");
//		}while(false);
//		}
		
		listaDeNombres.forEach(nombre ->{
			System.out.println("Nombre :" + nombre);
	});
		
		
	}

}

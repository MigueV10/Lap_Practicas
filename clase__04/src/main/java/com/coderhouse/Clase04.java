package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {
	
	public static void main(String []args) throws Exception {
		Perro primerPerro = new Perro();
		
		primerPerro.setNombre("Pinto");
		primerPerro.setColor("Negro");
		primerPerro.setRaza("Pitbull");
		primerPerro.setTamanio("chico");
		primerPerro.setEdad(3);
		
		System.out.println(primerPerro);//el get nombre se usa para ser mas especificos 
		primerPerro.caminar();
		primerPerro.comer();
		primerPerro.ladrar();
		
		String[] nombre = new String[] {
			"Hola",
			"Miguel",
			"Messi",
			"Matias",
			"Marce",
			"Jorge"
		};
		int radio= 3;// variable local dentro del main
		imprimirListaDeNombres(nombre);
		System.out.println("El area del circulo con radio " +radio+ " cm, es de "
				+calcularAreaDelCirculo(radio) + "cm");
		
		calcularAreaDelCirculo(radio);
	}
	
	private static void imprimirListaDeNombres(String [] nombreDePersonas) {
		for (String nombre : nombreDePersonas) { //foreach
			System.out.println("Nombre:" +nombre);
		}
	}
	
	
	static final double PI;
	static {
		PI =3.141516;
	}
	
	private static double calcularAreaDelCirculo(int radio) {//es una varibale que esta definida dentro de un parametro
		return PI * Math.pow(radio, 2);
	}

	
}

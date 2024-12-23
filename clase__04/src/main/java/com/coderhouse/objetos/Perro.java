package com.coderhouse.objetos;

public class Perro {
	
	//definimos una constante o variable de clase
	private  static final int EDAD_MAXIMA=15; //quiero que este dentro de la clase y que no se pueda modificar  

	//ERROR
	String mensajeDeError = "El perro no vive mas de " 
			+EDAD_MAXIMA+ "Anios de edad.! ";
	
	
		//Variables de instancia o Atributos del objeto
	private String nombre;
	private String raza;
	private String color;
	private String tamanio;
	private int edad;
	
	//encapsulamiento
	//Metodos 
	public void ladrar(){//cuando pongo void no quiero que me retorne nada..
		String nombreDelPerro=getNombre();//variable local 
		System.out.println("el perro " + nombreDelPerro + " esta ladrando.! ");
	}
	public void caminar(){//cuando pongo void no quiero que me retorne nada..
		System.out.println("el perro" + getNombre() + " esta caminando.!" );
	}
	public void comer(){//cuando pongo void no quiero que me retorne nada..
		System.out.println("el perro " +getNombre() + "esta comiendo.! ");
	}
	
	//
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {//le paso el parametro nombre 
		this.nombre = nombre;//el this es el propio de la clase
		//el nombre pasa por el parametro
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws Exception{
		if(edad > EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);
		}else {
			this.edad = edad;	
		}
	}	
	//una clase es un objeto? nooo! una clase es una clase
	//metodo convertir en un string 
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad="
				+ edad + "]";
	}
	
	
	
}

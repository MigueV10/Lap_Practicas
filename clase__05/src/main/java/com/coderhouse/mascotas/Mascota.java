package com.coderhouse.mascotas;

public class Mascota {
	private  static final int EDAD_MAXIMA=15;
	
	
	String mensajeDeError = "La mascota no vive mas de " 
			+EDAD_MAXIMA+ "Anios de edad.! ";
	
	//ATRIBUTOS DE CLASE 
	private String nombre;
	private String color;
	private String tamanio;
	protected Integer edad;
	
	
	//LOS METODOS DE CLASE 
	public void caminar(){//cuando pongo void no quiero que me retorne nada..
		System.out.println("La mascota " + getNombre() + " esta caminando.!" );
	}
	public void comer(){//cuando pongo void no quiero que me retorne nada..
		System.out.println("La mascota " +getNombre() + " esta comiendo.! ");
	}
	
	//ENCAPSULAMIENTOOO//PROTEGER LOS ATRIBUTOS 
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public Integer getEdad() {
		return this.edad;
	}
	public void setEdad(Integer edad)throws Exception{
	if(edad > EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);		
	}else {
			this.edad = edad;	
		}
	}
	@Override
	public String toString() {//me retorna un string 
		return "Mascota  [nombre=" + nombre +  ", color="
				+ color + ", tamanio=" + tamanio + ", edad=" + edad + "]";
	}
	
	
	 
}

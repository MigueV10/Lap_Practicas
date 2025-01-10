package com.coderhouse.mascotas;

public class Perro extends Mascota {
	
	//atributos propios del perro
	private String raza;
	
	//metodos propios de perro
	public void ladrar(){
		System.out.println("El perro " + getNombre() + " esta ladrando!");
	}
	@Override //Sobrescirbiendo de metodo >= POLIMORFISMO
	public void caminar(){//cuando pongo void no quiero que me retorne nada..
		System.out.println("El perro " + getNombre() + " esta caminando en el parque.!" );
	}
	
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

//	@Override //decoradores, sobrescribiendo
//	public String toString() {
//		return "Hola gente como va?";
//	}
	
	
	
}

package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")

public class Curso {
	
	@Id// Primary KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	
	//HAREMOS UNA RELACION ENTRE DOS TABLAS ALUMNOS SE PUEDA INSCRIBIR A CURSOS.
	//relacion alumno>cursos
	
	
	@ManyToMany(fetch =FetchType.EAGER)
	@JoinTable
			(name = "curso_alumno",//como quiero que se llame la nueva tabla
			joinColumns = @JoinColumn(name="curso_id"),//voy a generar columna curso id que se relaciona con alumno id que lo va a tomar de la lista de alumnos
			inverseJoinColumns = @JoinColumn(name="alumno:id")
			)
	private List<Alumno> alumnos = new ArrayList<>();

	public Curso() {
		super();
	}
	public Curso(String Nombre) {
		this();
		this.nombre=nombre;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
	
}

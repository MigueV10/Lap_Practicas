package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Alumnos")
public class Alumno{
	
	//ENTIDAD ALUMNO 
	
	@Id// Primary KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTOINCREMENTAL
	private Long id;
	
	@Column(name="Nombre")
	private String nombre;
	private String apellido;
	
	@Column(unique=true, nullable = false)//este dato sera unico y no nulo
	private int  matricula;
	@Column(unique=true, nullable = false)
	private String curp;
	
	
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	
	private LocalDateTime createdAt;//fecha automatica del alumno

}

package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema( description = "Modelo De Alumno", title = "Modelo de Alumno")
@Entity
@Table(name = "Alumnos")
public class Alumno{
	
	//ENTIDAD ALUMNO 
	
	@Schema( description = "ID del alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id// Primary KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTOINCREMENTAL
	private Long id;
	
	@Schema( description = "Nombre del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Miguel Eduardo")
	@Column(name="Nombre")
	private String nombre;
	
	@Schema( description = "Apellido del alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Urena  Nieto")
	private String apellido;
	
	@Schema( description = "Matricula del alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "21091112")
	@Column(unique=true, nullable = false)//este dato sera unico y no nulo
	private int  matricula;
	
	@Schema( description = "CURP del alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "L21091112")
	@Column(unique=true, nullable = false)
	private String curp;
	
	@Schema( description = "Listado de Cursos en los que se inscribio el Alumno")
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	
	@Schema( description = "Fecha de alta del Alumno", example = "2025/01/15")
	private LocalDateTime createdAt;//fecha automatica del alumno

}

package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//TABLA EN MI BASE DE DATOS
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(description = "Modelo de Categorias", title = "Modelo de categoria")
@Entity
@Table(name= "Categorias")//creacion de tabla en mi base de datos
public class Categoria {
	
	@Schema( description = "ID de la categoria", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id// Primary KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTOINCREMENTAL
	private Long id;
	
	@Schema( description = "Nombre de la categoria", requiredMode = Schema.RequiredMode.REQUIRED, example = "Backend")
	@Column(unique = true, nullable = false)
	private String nombre;

	@OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Curso> cursos = new ArrayList<>();
}

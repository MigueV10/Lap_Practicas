package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.InscripcionDTO;
import com.coderhouse.models.Alumno;

import com.coderhouse.service.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/alumnos")
@Tag(name="Gestion de Alumnos", description = "Endpoints para gestionar Alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	@Operation(summary = "Obtener Lista de Alumnos")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Lista de alumnos obtenida Correctamente",
					content= {
					@Content(mediaType = "application/json",
							schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "404", description = "Error al intentar obtener a los alumnos",
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",
			content = @Content(mediaType = "application/json",
			schema = @Schema(implementation = ErrorResponse.class)))})
	@GetMapping
	public ResponseEntity<List<Alumno>> getAllAlumnos() {
		try {
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos); // 200
		}catch (IllegalArgumentException e) {
				return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}

	}
	
	
	@Operation(summary = "Obtener un Alumno por su ID")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Alumno obtenido Correctamente",content= {
					@Content(mediaType = "application/json",schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el alumno",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))})
	
	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id) {
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno); // 200
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}
	}

	@Operation(summary = "Crear un Alumno nuevo")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "201", description = "Alumno creado Correctamente",content= {
					@Content(mediaType = "application/json",schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "400", description = "Error al intentar el alumno",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))})
	@PostMapping
	public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
		try {
			Alumno alumnoCreado = alumnoService.saveAlumno(alumno);
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoCreado); // 201 Created
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}
	}
	
	@Operation(summary = "EDitar un Alumno por su ID")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Alumno EDITADO Correctamente",content= {
					@Content(mediaType = "application/json",schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "400", description = "Error al editar el alumno",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))})
	
	@PutMapping("/{id}")
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id, @RequestBody Alumno alumnoModificado) {
		try {
			Alumno updateAlumno = alumnoService.updateAlumnoById(id, alumnoModificado);
			return ResponseEntity.ok(updateAlumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}

	}

	@Operation(summary = "Eliminar un Alumno por su ID")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Alumno Eliminado Correctamente",content= {
					@Content(mediaType = "application/json",schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "404", description = "Error al eliminar alumno, El alumno no existe",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))})
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deteAlumnoById(@PathVariable Long id) {
		try {
			alumnoService.deleteAlumnoById(id);
			return ResponseEntity.noContent().build(); // 204

		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}
	}
	
	
	@Operation(summary = "Inscribir un Alumno a un curso, usando DTO")//Indica la operacion a realizar(que hace ese metodo)
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Alumno Inscrito Correctamente",content= {
					@Content(mediaType = "application/json",schema = @Schema(implementation = Alumno.class))}),
			@ApiResponse(responseCode = "404", description = "Error al inscribir al alumno, El alumno no existe",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))})
	

	//METODO PARA INSCRIBIR UN ALUMNO A VARIOS CURSOS
	@PostMapping("/inscribir")
	public ResponseEntity<Alumno> inscribirAlumnoACursos (@RequestBody InscripcionDTO dto){
		try {
			Alumno alumno = alumnoService.inscribirAlumnoACursos(dto);
			return ResponseEntity.ok(alumno);
		}catch(IllegalArgumentException e) {
			return ResponseEntity.badRequest().build();//400
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();//500
		}
	}
}
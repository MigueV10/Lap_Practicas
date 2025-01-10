package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.Alumno;
import com.coderhouse.repositories.AlumnoRepository;

//API REST/REST CONTROLLER


@RestController//recibo solicitudes desde cualquier URL, donde mappearemos 
@RequestMapping("/api/alumnos")//cada vez que yo reciba una solicitud en esta url
public class AlumnoController {//entra a este controlador!!
	
	
	//solicitudes, metodos
	//mi controlador quiera que acceda a mi repositorio
	//tengo que inyectar con @autowired
	
	@Autowired
	private AlumnoRepository alumnoRepository;// me permite acceso a todo el repositorio donde los metodos sean accecibles
	
	@GetMapping
	public List<Alumno> getAllAlumnos(){//metodo que tgraifga ltodos los alumnos que existan enm la base de datos
		return alumnoRepository.findAll();//si quiero conseguir todos los alumnos que estan en la base de datos, se lo pido al repositorio
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
		try {
		if(alumnoRepository.existsById(id)) {//retorno algo
			Alumno alumno = alumnoRepository.findById(id).get();
			return ResponseEntity.ok(alumno);// 200
		}else {//si no existe va a retornar un responsEntity
			return ResponseEntity.notFound().build(); //404
		}
		}catch(Exception e){
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();//200
		}
		
	}
	@PostMapping
	public Alumno createAlumno(@RequestBody Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	
}

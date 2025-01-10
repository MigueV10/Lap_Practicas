package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner{//implementamos esta interface

	@Autowired//inyecta una clase con todos sus metodos
	private DaoFactory dao;
	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Curso curso1  = new Curso("Java");
			Curso curso2  = new Curso("HTML5");
			Curso curso3  = new Curso("CSS3");
			Curso curso4  = new Curso("JavaScript");
			
			Alumno alumno1 = new Alumno("Miguel", "Urena", 21091112, "UENMDD23");
			
			Alumno alumno2 = new Alumno("Kendra", "Nicole", 2234923, "KN234K");
			Alumno alumno3 = new Alumno("Kenya", "Najera", 2234555, "KN334SDKD");
			Alumno alumno4 = new Alumno("Ricardo ", "Piedras", 2234455, "RP23455");
			
			dao.persistirAlumno(alumno1);
			dao.persistirAlumno(alumno2);
			dao.persistirAlumno(alumno3);
			dao.persistirAlumno(alumno4);
			
			dao.persistirCurso(curso1);
			dao.persistirCurso(curso2);
			dao.persistirCurso(curso3);
			dao.persistirCurso(curso4);


			
			
			
			//PERSISTIRLO LA INFORMACION QUIERO QUE SE GUARDE EN LA BASE DE DATOS
			
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	
}

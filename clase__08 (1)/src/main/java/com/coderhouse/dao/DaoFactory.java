package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;//pertenece a hibernate
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {
	
	@PersistenceContext
	private EntityManager em;//permite utilizar a em accediendo a todos los metods
	
	@Transactional// metodo de transicion
	public void persistirAlumno(Alumno alumno) {
		em.persist(alumno);//este metodo se encargara de persitir al alumno
	}
	@Transactional// metodo de transicion
	public void persistirCurso(Curso curso) {
		em.persist(curso);//este metodo se encargara de persitir al alumno
	}
}
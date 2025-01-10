package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;//pertenece a hibernate
import jakarta.persistence.TypedQuery;
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
	@Transactional// metodo de transicion
	public void persistirCategoria(Categoria categoria) {
		em.persist(categoria);//este metodo se encargara de persitir al alumno
	}
	
	@Transactional
	public Curso getCursoById(Long cursoId)throws Exception{
		try {
			
			TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c WHERE c.id = :id", Curso.class);
			return query.setParameter("id", cursoId).getSingleResult();
		} catch (Exception e) {
			throw new Exception("el curso no existe .! ");
		}
	}
	
	
	@Transactional
	public Categoria getCategoriaById(Long categoriaId)throws Exception{
		try {
			
			TypedQuery<Categoria> query = em.createQuery("SELECT ca FROM Categoria ca WHERE ca.id = :id", Categoria.class);
			return query.setParameter("id",categoriaId).getSingleResult();
		} catch (Exception e) {
			throw new Exception("La categoria no existe .! ");
		}
	}
	@Transactional
	public void asignarCategoriaACurso(Long cursoId,Long categoriaId)throws Exception{
		//obtener el curso por el id
		Curso curso = getCursoById(cursoId);
		if(curso==null) {
			throw new Exception("El curso con id: "+ cursoId + "no Existe.!");
		}
		//obtener el categoria por el id
		Categoria categoria = getCategoriaById(categoriaId);
		if(categoria==null) {
			throw new Exception("El categoria con id: "+ cursoId + "no Existe.!");
		}
		
		curso.setCategoria(categoria);
		
		//persistir datos
		em.merge(curso);
		
				
	}
}
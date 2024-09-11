package com.examen.dao;

import java.util.List;
import java.util.Optional;

import com.examen.entity.Matricula;


public interface MatriculaDao {
	
	Matricula create(Matricula m);
	Matricula update(Matricula m);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();

}

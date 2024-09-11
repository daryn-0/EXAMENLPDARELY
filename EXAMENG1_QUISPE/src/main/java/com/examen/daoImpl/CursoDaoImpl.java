package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.CursoDao;
import com.examen.entity.Curso;
import com.examen.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

}

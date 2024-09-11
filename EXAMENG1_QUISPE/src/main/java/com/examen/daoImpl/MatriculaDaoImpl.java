package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.MatriculaDao;
import com.examen.entity.Matricula;
import com.examen.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao{

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public Matricula create(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public Matricula update(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

}

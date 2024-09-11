package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.GradoDao;
import com.examen.entity.Grado;
import com.examen.repository.GradoRepository;

@Component
public class GradoDaoImpl implements GradoDao{

	@Autowired
	private GradoRepository gradoRepository;
	
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return gradoRepository.save(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return gradoRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradoRepository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return gradoRepository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return gradoRepository.findAll();
	}

}

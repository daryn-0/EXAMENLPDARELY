package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dao.GradoDao;
import com.examen.entity.Grado;
import com.examen.service.GradoService;

@Service
public class GradoServiceImpl implements GradoService{

	@Autowired
	private GradoDao dao;
	
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return dao.create(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}

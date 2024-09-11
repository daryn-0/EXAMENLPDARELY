package com.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Matricula;
import com.examen.service.MatriculaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping
	public ResponseEntity<List<Matricula>> readAll(){
		try {
			List<Matricula> matriculas = matriculaService.readAll();
			if (matriculas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(matriculas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Matricula> crear(@Valid @RequestBody Matricula ma){
		try {
			Matricula m = matriculaService.create(ma);
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Matricula> getMatriculaId(@PathVariable("id") Long id){
		try {
			Matricula m = matriculaService.read(id).get();
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Matricula> delMatricula(@PathVariable("id") Long id){
		try {
			matriculaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMatricula(@PathVariable("id") Long id, @Valid @RequestBody Matricula ma){
		Optional<Matricula> m = matriculaService.read(id);
		if (m.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} else {
			return new ResponseEntity<>(matriculaService.update(ma), HttpStatus.OK);
		}
	}

}

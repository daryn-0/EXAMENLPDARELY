package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{

}

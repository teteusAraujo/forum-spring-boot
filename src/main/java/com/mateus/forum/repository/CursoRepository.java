package com.mateus.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.forum.model.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}

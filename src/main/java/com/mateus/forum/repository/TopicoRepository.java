package com.mateus.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}

package com.mateus.forum.controller;

import com.mateus.forum.model.Curso;
import com.mateus.forum.model.Topico;
import com.mateus.forum.repository.CursoRepository;
import com.mateus.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

public class TopicoForm {
	@NotNull 
	private String  titulo;
	@NotNull
	private String mensagem;
	@NotNull
	private String nomeCurso;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		
		return topico;
	}
	
	

}

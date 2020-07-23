package com.mateus.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.mateus.forum.model.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriaçao;
	
	
	
	public TopicoDTO(Topico topico) {
		
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriaçao = topico.getDataCriacao();
	}
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriaçao() {
		return dataCriaçao;
	}
	
	public static List<TopicoDTO> converter(List<Topico> topicos){
		return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
	}
	
	
}

package com.mateus.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.forum.controller.dto.TopicoDTO;
import com.mateus.forum.model.Curso;
import com.mateus.forum.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		Topico topico= new Topico("Duvida em Java ","Duvida com Spring Boot", new Curso("Java Spring", "Programação"));
		return TopicoDTO.converter(Arrays.asList(topico,topico,topico));
	}
}

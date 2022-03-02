package com.gerenciamento_tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerenciamento_tarefas.model.Tarefa;
import com.gerenciamento_tarefas.repository.TarefaRepository;


@Controller
@RequestMapping("/tarefa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TarefaController {
	
	@Autowired
	private TarefaRepository repository;
	
	@PostMapping
	public ResponseEntity<Tarefa> postTarefa(@RequestBody Tarefa tarefa){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(tarefa));
	}
	
	

}

package com.gerenciamento_tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerenciamento_tarefas.model.Pessoa;
import com.gerenciamento_tarefas.repository.PessoaRepository;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> postPessoa(@RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(pessoa));
	}
	
	@PutMapping("put/pessoas/{id}")
	public ResponseEntity<Pessoa> putPessoas(@RequestBody Pessoa pessoa){
		return ResponseEntity.ok(repository.save(pessoa)); 		
	}
	
	@DeleteMapping("delete/pessoas/{id}")
	public void detetePessoa(@PathVariable long id) {
		repository.deleteById(id);
	}	
}


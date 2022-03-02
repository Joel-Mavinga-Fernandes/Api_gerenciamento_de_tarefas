package com.gerenciamento_tarefas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamento_tarefas.model.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Long> {
	
	public List<Pessoa> findAllByNomeContainingIgnoreCase(String nome);

}

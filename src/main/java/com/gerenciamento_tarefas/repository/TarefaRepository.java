package com.gerenciamento_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.gerenciamento_tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
  

}

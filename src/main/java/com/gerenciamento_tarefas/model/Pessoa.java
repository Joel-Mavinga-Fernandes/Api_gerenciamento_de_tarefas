package com.gerenciamento_tarefas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=2, max=100)
	private String nome;
	
	@NotNull
	private long idDepartamento;
	
	@OneToMany(mappedBy = "pessoaAlocada", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("pessoaAlocada")
	private List<Tarefa> tarefa;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	public List<Tarefa> getTarefa() {
		return tarefa;
	}
	public void setTarefa(List<Tarefa> tarefa) {
		this.tarefa = tarefa;
	}
	
}

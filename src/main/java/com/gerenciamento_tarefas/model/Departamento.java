package com.gerenciamento_tarefas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="tb_departamento")
public class Departamento {
	
	@Id
	private long id;
	
	@NotNull
	private String titulo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return titulo;
	}

	public void setDepartamento(String departamento) {
		this.titulo = departamento;
	}
	
	

}

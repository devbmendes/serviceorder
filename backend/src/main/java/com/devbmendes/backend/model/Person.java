package com.devbmendes.backend.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nif;
	private String nome;
	private String telefone;

	public Person(Integer id, String nif, String nome, String telefone) {
		super();
		this.id = id;
		this.nif = nif;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Person() {
		super();
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id) && Objects.equals(nif, other.nif);
	}

}

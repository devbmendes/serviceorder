package com.devbmendes.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devbmendes.backend.model.SO;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Client extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	@OneToMany(mappedBy = "client")
	private List<SO> list = new ArrayList<>();

	public Client(Integer id, String nif, String nome, String telefone) {
		super(id, nome, telefone);
		// TODO Auto-generated constructor stub
	}

	public List<SO> getList() {
		return list;
	}

	public void setList(List<SO> list) {
		this.list = list;
	}

}

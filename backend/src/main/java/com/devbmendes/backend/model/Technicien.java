package com.devbmendes.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@jakarta.persistence.Entity
public class Technicien extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Technicien() {
		super();

	}
	@jakarta.persistence.OneToMany(mappedBy = "technicien")
	private List<SO> list = new ArrayList<>();

	public Technicien(Integer id, String nif, String nome, String telefone) {
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

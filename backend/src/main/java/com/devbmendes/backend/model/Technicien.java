package com.devbmendes.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;


public class Technicien extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Technicien() {
		super();

	}
	@OneToMany(mappedBy = "technicien")
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

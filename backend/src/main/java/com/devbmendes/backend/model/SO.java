package com.devbmendes.backend.model;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

@jakarta.persistence.Entity
public class SO {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Integer id;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mn")
	private LocalDateTime openedDate;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mn")
	private LocalDateTime closedDate;
	
	private Integer priority;
	
	private Integer status;
	
	@jakarta.persistence.ManyToOne
	@jakarta.persistence.JoinColumn(name = "id_technicien")
	
	private String obs;
	
	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	private Technicien technicien;

	@jakarta.persistence.ManyToOne
	@jakarta.persistence.JoinColumn(name = "id_client")
	private Client client;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(LocalDateTime openedDate) {
		this.openedDate = openedDate;
	}

	public LocalDateTime getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(LocalDateTime closedDate) {
		this.closedDate = closedDate;
	}

	public Priority getPriority() {
		return Priority.toEnum(this.priority);
	}

	public void setPriority(Priority priority) {
		this.priority = priority.getCod();
	}

	public Status getStatus() {
		return Status.toEnum(this.status);
	}

	public void setStatus(Status status) {
		this.status = status.getCod();
	}

	public Technicien getTechnicien() {
		return technicien;
	}

	public void setTechnicien(Technicien technicien) {
		this.technicien = technicien;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public SO() {
		super();
		this.setOpenedDate(LocalDateTime.now());
		this.setPriority(Priority.LOW);
		this.setStatus(Status.OPEN);
	}

	public SO(Integer id,Priority priority,String obs, Status status, Technicien technicien,
			Client client) {
		super();
		this.id = id;
		this.setOpenedDate(LocalDateTime.now());
		this.priority = (priority == null) ? 0 : priority.getCod();
		this.obs = obs;
		this.status = (status == null) ? 0 : status.getCod();
		this.technicien = technicien;
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SO other = (SO) obj;
		return Objects.equals(id, other.id);
	}

}

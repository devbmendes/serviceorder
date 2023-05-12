package com.devbmendes.backend.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class SO {
	private Long id;
	private LocalDateTime openedDate;
	private LocalDateTime closedDate;
	private Integer priority;
	private Integer status;
	private Technicien technicien;
	private Client client;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public SO(Long id, LocalDateTime closedDate, Priority priority, Status status,
			Technicien technicien, Client client) {
		super();
		this.id = id;
		this.setOpenedDate(LocalDateTime.now());
		this.closedDate = closedDate;
		this.priority = (priority == null)? 0: priority.getCod();
		this.status = (status == null)? 0: status.getCod();
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

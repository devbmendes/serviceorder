package com.devbmendes.backend.model;

public enum Status {
	OPEN(0,"OPEN"),ONGOING(1,"ONGOING"),CLOSED(2,"CLOSED");
	
	private Integer cod;
	private String description;
	public Integer getCod() {
		return cod;
	}
	
	
	private Status(Integer cod, String description) {
		this.cod = cod;
		this.description = description;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Status x: Status.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid Status" + cod);
		
	}
}

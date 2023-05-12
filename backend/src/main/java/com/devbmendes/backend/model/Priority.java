package com.devbmendes.backend.model;


public enum Priority {

	LOW(0,"LOW"),MEDIUM(1,"MEDIUM"),HIGHT(2,"HIGHT");
	
	private Integer cod;
	private String description;
	public Integer getCod() {
		return cod;
	}
	
	
	private Priority(Integer cod, String description) {
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
	
	public static Priority toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Priority x: Priority.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid Priority"+ cod);
		
	}
}

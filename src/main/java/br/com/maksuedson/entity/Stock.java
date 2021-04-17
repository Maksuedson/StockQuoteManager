package br.com.maksuedson.entity;

import java.io.Serializable;


public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String description;
	
	public Stock() {		
	}

	public Stock(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

}
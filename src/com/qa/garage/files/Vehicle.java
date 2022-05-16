package com.qa.garage.files;

public abstract class Vehicle extends Garage implements Fix {

	// Creating attributes
	private String id;
	private String clas;
	private String model;
	private boolean electric;

	// Constructor
	public Vehicle(String id, String clas, String model, boolean electric) {
		super();
		this.id = id;
		this.clas = clas;
		this.model = model;
		this.electric = electric;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

}

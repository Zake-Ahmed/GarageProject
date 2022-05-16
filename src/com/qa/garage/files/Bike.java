package com.qa.garage.files;

public class Bike extends Vehicle implements Fix {

	// Creating attributes
	private String type;
	private int topSpeed;
	private float wheelSize;

	// Constructor
	public Bike(String id, String clas, String model, boolean electric, String type, int topSpeed, float wheelSize) {
		super(id, clas, model, electric);
		this.type = type;
		this.topSpeed = topSpeed;
		this.wheelSize = wheelSize;
	}

	// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public float getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(float wheelSize) {
		this.wheelSize = wheelSize;
	}

	@Override
	public float fixVehicle() {
		if (isElectric()) {
			fixCost += 500;
		} else {
			fixCost += 0;
		}

		if (this.type == "Motor Bike") {
			fixCost += 400;
		} else {
			fixCost += 100;
		}
		if (this.topSpeed >= 100) {
			fixCost += 300;
		} else {
			fixCost += 50;
		}
		if (this.wheelSize >= 4) {
			fixCost += 60;
		} else {
			fixCost += 30;
		}

		return fixCost;

	}

}

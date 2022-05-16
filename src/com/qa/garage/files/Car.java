package com.qa.garage.files;

public class Car extends Vehicle implements Fix {
	// Creating attributes
	private int doors;
	private float trunkSize;
	private boolean manual;

	// Constructor
	public Car(String id, String clas, String model, boolean electric, int doors, float trunkSize, boolean manual) {
		super(id, clas, model, electric);
		this.doors = doors;
		this.trunkSize = trunkSize;
		this.manual = manual;
	}
	// Getters and Setters

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public float getTrunkSize() {
		return trunkSize;
	}

	public void setTrunkSize(float trunkSize) {
		this.trunkSize = trunkSize;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	@Override
	public float fixVehicle() {
		if (isElectric()) {
			fixCost += 500;
		} else {
			fixCost += 0;
		}

		if (this.manual) {
			fixCost += 300;
		} else {
			fixCost += 500;
		}
		if (this.trunkSize >= 5) {
			fixCost += 100;
		} else {
			fixCost += 50;
		}
		if (this.doors >= 4) {
			fixCost += 60;
		} else {
			fixCost += 30;
		}

		return fixCost;
	}

}

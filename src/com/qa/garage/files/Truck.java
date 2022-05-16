package com.qa.garage.files;

public class Truck extends Vehicle implements Fix {
	// Creating attributes
	private int numWheels;
	private float weight;
	private float maxLoad;

	// Constructor
	public Truck(String id, String clas, String model, boolean electric, int numWheels, float weight, float maxLoad) {
		super(id, clas, model, electric);
		this.numWheels = numWheels;
		this.weight = weight;
		this.maxLoad = maxLoad;

	}

	// Getters and Setters
	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(float maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public float fixVehicle() {
		if (isElectric()) {
			fixCost += 500;
		} else {
			fixCost += 0;
		}

		if (this.numWheels >= 6) {
			fixCost += 600;
		} else {
			fixCost += 100;
		}
		if (this.weight >= 1000) {
			fixCost += 1000;
		} else {
			fixCost += 200;
		}
		if (this.maxLoad >= 1000) {
			fixCost += 600;
		} else {
			fixCost += 100;
		}

		return fixCost;
	}

}

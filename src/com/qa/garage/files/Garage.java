package com.qa.garage.files;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicle> garage = new ArrayList<>();
	public float fixCost;

	public boolean addVehicle(Vehicle vechicle) {

		System.out.println("Adding " + vechicle.getModel() + " to garage");
		System.out
				.println("---------------------------------------------------------------------------------------------"
						+ "---------------------------------------");
		return garage.add(vechicle);
	}

	public Vehicle deleteVehicle(int i) {
		System.out.println("Removing " + garage.get(i));
		return garage.remove(i);
	}

	public Vehicle getVehicle(int i) {
		// System.out.println("Vehicle is : " + garage.get(i));

		return garage.get(i);
	}

	public float fixVehicle(int i) {
		float x = garage.get(i).fixVehicle();
		return x;

	}

	public int Size() {
		return garage.size();
	}

	public String removeAll() {
		garage.removeAll(garage);
		return "Garage cleared";

	}

}

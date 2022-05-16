package com.qa.garage;

import com.qa.garage.files.*;

public class Runner {

	public static void main(String[] args) {

		Garage qaGarage = new Garage();
		Car car1 = new Car("123", "Car", "BMW", false, 4, 12f, false);
		Bike bike1 = new Bike("232", "Bike", "Harley Davidson", true, "Motor Bike", 130, 3);
		qaGarage.addVehicle(car1);
		qaGarage.addVehicle(bike1);
		Fixes fix1 = new Fixes();
		fix1.fixAllVehicle(qaGarage);
		System.out.println(qaGarage.removeAll());
		Car car2 = new Car("123", "Car", "Toyota", false, 4, 12f, false);
		Bike bike2 = new Bike("221212", "Bike", "Boss Hoss", true, "Motor Bike", 130, 3);
		Bike bike3 = new Bike("2353242", "Bike", "Harley Davidson", false, "Bike", 30, 3);
		Bike bike4 = new Bike("2214132432", "Bike", "Lightning ", true, "Motor ", 80, 10);
		Truck truck1 = new Truck("2332321421512", "Truck", "Jeap", false, 10, 800f, 2000);
		qaGarage.addVehicle(truck1);
		qaGarage.addVehicle(bike3);
		qaGarage.addVehicle(bike4);
		qaGarage.addVehicle(bike1);
		qaGarage.addVehicle(bike2);
		qaGarage.addVehicle(car1);
		qaGarage.addVehicle(car2);
		Fixes fix2 = new Fixes();
		fix2.fixVehicleClass(qaGarage, "Bike");

	}

}

package com.qa.garageproject.files;

public class Fixes {
	public void fixAllVehicle(Garage qaGarage) {
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Fixing all vehicles");
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < qaGarage.Size(); i += 1) {

			System.out.println("£" + qaGarage.fixVehicle(i) + " Is the price to fix the "
					+ qaGarage.getVehicle(i).getModel() + " Id number " + qaGarage.getVehicle(i).getId());
			System.out.println(
					"---------------------------------------------------------------------------------------------"
							+ "---------------------------------------");
		}
		System.out.println(qaGarage.removeAll());
		System.out
				.println("---------------------------------------------------------------------------------------------"
						+ "---------------------------------------");

	}

	public void fixVehicleClass(Garage qaGarage, String clas) {
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Fixing all " + clas +"s");
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		float total = 0;
		for (int i = 0; i < qaGarage.Size(); i += 1) {

			if (qaGarage.getVehicle(i).getClas() == clas) {
				float cost = qaGarage.fixVehicle(i);
				System.out.println("£" + cost + " Is the price to fix the " + qaGarage.getVehicle(i).getModel()
						+ " Id number " + qaGarage.getVehicle(i).getId());

				total += cost;

				System.out.println(
						"---------------------------------------------------------------------------------------------"
								+ "---------------------------------------");

			}

		}
		System.out.println("Total price is £" + total);
		System.out
				.println("---------------------------------------------------------------------------------------------"
						+ "---------------------------------------");

		System.out.println(qaGarage.removeClass(clas));
		System.out
				.println("---------------------------------------------------------------------------------------------"
						+ "---------------------------------------");
		for (int i = 0; i < qaGarage.Size(); i += 1) {
			System.out.println(qaGarage.getVehicle(i).getModel() + " " + qaGarage.getVehicle(i).getClas()
					+ " Id number " + qaGarage.getVehicle(i).getId() + " is left in the garage ");
			System.out.println(
					"---------------------------------------------------------------------------------------------"
							+ "---------------------------------------");
		}

	}
}
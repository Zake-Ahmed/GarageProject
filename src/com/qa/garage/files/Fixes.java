package com.qa.garage.files;

public class Fixes {
	public void fixAllVehicle(Garage qaGarage) {
		for (int i = 0; i < qaGarage.Size(); i += 1) {

			System.out.println("£" + qaGarage.fixVehicle(i) + " Is the price to fix the "
					+ qaGarage.getVehicle(i).getModel() + " Id number " + qaGarage.getVehicle(i).getId());
			System.out.println(
					"---------------------------------------------------------------------------------------------"
							+ "---------------------------------------");
		}

	}

	public void fixVehicleClass(Garage qaGarage, String clas) {
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

	}
}

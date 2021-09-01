package com.iot.general;

public class IotRunner {

	public static void main(String[] args) {
		Appartment appartment1 = new Appartment();
		appartment1.addHomeApplicane(true, "Fan", 5);
		appartment1.addHomeApplicane(true, "Light", 1);
		appartment1.addHomeApplicane(false, "Laptop", 2);
		System.out.println(appartment1);
		appartment1.sortByUnit();
		System.out.println(appartment1);
		System.out.println(appartment1.getSortedDevice());
		System.out.println(appartment1.getLoadAmount());
		appartment1.sortByUnitDescendentent();
		System.out.println(appartment1.getSortedDevice());
		System.out.println(appartment1);

	}

}

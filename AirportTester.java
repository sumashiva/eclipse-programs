package com.xworkz.different_method;

public class AirportTester {

public static void main(String[] args) {
		
		Airport aport = new Airport();
		aport.addportnames1("Kempegowda International Airport – BLR");
		aport.addportnames1("Chennai International Airport – MAA");
		aport.addportnames1("Cochin International Airport – COK ");
		aport.addportnames1("Indira Gandhi International Airport – DEL");
		aport.addportnames1("Dabolim Airport – GOI");
		
		aport.displayAirportOperator();
		aport.deleteAirportOperator(5);
		
		String nref1="Visakhapatnam International Airport";
		aport.updateAirportOperator(1,nref1);
		
		
		String[] am=aport.getPortnames();
		for (int i = 0; i < am.length; i++) {
			System.out.println(am[i]);
		}

	}

}


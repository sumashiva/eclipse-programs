package com.xworkz.different_method;
import com.xworkz.different_method.*;
public class CurdOperation {


	public static void main(String[] args) {

		 CurdTester refgin = new  CurdTester();

		refgin.addGin("LONDON DRY GIN");
		refgin.addGin("OLD TOM");
		refgin.addGin("PLTMOUTH GIN");
		refgin.addGin("NAVY STRENGTH GIN");

		refgin.displayGins();

		 CurdTester restaurant = new  CurdTester();

		restaurant.addRestaurant("The Table, Mumbai");
		restaurant.addRestaurant("Bomra's, Goa");
		restaurant.addRestaurant("Trishna, Mumbai");
		restaurant.addRestaurant("Slink & Bardot, Mumbai");

		restaurant.displayResort();

		 CurdTester resort = new  CurdTester();

		resort.addResort("woodrose");
		resort.addResort("Royal Orchid Resort & Convention Centre");
		resort.addResort("Palm Meadows Club");

		resort.displayResort();

		 CurdTester waterFall = new  CurdTester();

		waterFall.addWaterFall("dudhsagar waterfalls");
		waterFall.addWaterFall("hebbe waterfalls");
		waterFall.addWaterFall("magod waterfalls");

		waterFall.displayWaterFall();

	}

}
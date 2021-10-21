package com.xworks.operator.beach;

import com.xworks.operator.beach.CoolDrink;

public class CoolDrinkStarter {

	public static void main(String[] values) {

		CoolDrink ref = new CoolDrink();
		ref.addBrandName("pepsi");
		ref.addBrandName("maza");    
		ref.addBrandName("limca");
		ref.addBrandName("fanta");
		ref.addBrandName("mirinda pulp");
		ref.addBrandName("mirinda pppp");
		ref.addBrandName(" pulp");
		
		System.out.println("------------------");
		
	    String[] refName=ref.bandName();
	    
	    for (int i = 0; i < refName.length; i++) 
	    {
			System.out.println(refName[i]);
		}
	    
	    
		System.out.println("------------------");

		ref.delete(4);
		ref.delete(2);
		System.out.println("------------------");

		ref.update(2, "lemonjuice");
	}
}

package com.xworkz.different_method;
import com.xworkz.different_method.ChocolateOperator;
public class ChocolateTester {

	public static void main(String[] args) {

		ChocolateOperator ChocolateTester = new ChocolateOperator();
		int ChocSize = ChocolateTester.getadder1();
		System.out.println(ChocSize);

		ChocolateTester.addChocSize(78);
		ChocolateTester.addChocSize(89);

		ChocolateTester.addChocSize(15);
		ChocolateTester.displayChocSize();

	}

}
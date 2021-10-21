package com.xworks.operator.beach;

public class CoolDrink {

	private String[] brandName = new String[5];
	private int leka;

	public void addBrandName(String name) {
		if (this.leka < brandName.length) {
			this.brandName[this.leka++] = name;
			System.out.println("the name: ".concat(name));
		} else {
			System.err.println("can not add brand name");
		}
	}

	public String[] bandName() {
		return brandName;
	}

	public void delete(int index) {
		if (index < brandName.length && index >= 0) {
			this.brandName[index] = null;
			System.out.println("nulled at : ".concat(String.valueOf(index)));
		} else {
			System.out.println("can not do null at");
		}
	}

	public void update(int count, String name) {
		if (count < brandName.length && count >= 0) {
			this.brandName[count] = name;
			System.out.println("updated name is".concat(name));
		} else {
			System.out.println("can not update at ".concat(String.valueOf(count)));
		}
	}
}

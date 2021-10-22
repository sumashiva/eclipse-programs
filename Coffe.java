package array;

public class Coffe {

	private String [] brandName=new String[6];
	private int num;
	
	
	public void addBrandName(String name) {
		if (this.num < brandName.length) {
			this.brandName[this.num++] = name;
			System.out.println("the name: ".concat(name));
		} else {
			System.err.println("can not add brand name");
		}
	}
	
	public void delete(int  yensu) {
		if (yensu < brandName.length &&yensu >= 0) {
			this.brandName[yensu] = null;
			System.out.println("nulled at : ".concat(String.valueOf(yensu)));
		} else {
			System.out.println("can not do null at");
		}
	}

	public void update(int collect, String name) {
		if (collect < brandName.length && collect >= 0) {
			this.brandName[collect] = name;
			System.out.println("updated name is".concat(name));
		} else {
			System.out.println("can not update at ".concat(String.valueOf(collect)));
		}
	}

}

package inheritence;

public class NaturalSaloon extends Saloon{
	public String name="ylg";
	 public int noOfHajamas=2;
	 public NaturalSaloon() {
		System.out.println("invoked natural saloon");
	}
	 
	 public  NaturalSaloon(String name) 
	 {
		 System.out.println("invoked paramterised const");
		
	}

}

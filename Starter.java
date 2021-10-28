package inheritence;

public class Starter {
	public static void main(String[] values)
	{
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		Saloon saloon=new NaturalSaloon();
		System.out.println(naturalSaloon.name);
		System.out.println(saloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
		System.out.println(saloon.noOfHajamas);
		
	}

}

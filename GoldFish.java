package inheritence;

public class GoldFish extends Fish{

	public float height;
	public float weight;

	GoldFish()
	{
		super();
		//this(10,500);
		System.out.println("calling SharkFish");
	}


	GoldFish(float height,float weight)
	{
		this.height=height;
		this.weight=weight;
		System.out.println("invoking parameterised cont");
		System.out.println(height);
		System.out.println(weight);
	}
}

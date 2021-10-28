package inheritence;

public class SharkFish extends Fish{
public float height;
public float weight;

SharkFish()
{
	super();
	//this(10,500);
	System.out.println("calling SharkFish");
}


SharkFish(float height,float weight)
{
	this.height=height;
	this.weight=weight;
	System.out.println("invoking parameterised cont");
	System.out.println(height);
	System.out.println(weight);
}
}

package inheritence;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		 SharkFish smallfish=new SharkFish();
		  Fish fish1=new SharkFish(20,15);
		  
		  GoldFish goldfish=new GoldFish();
		  Fish fish2=new GoldFish();
		  
	}

}

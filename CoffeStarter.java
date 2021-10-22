package array;
import array.Coffe;
public class CoffeStarter 
{
	public static void main(String[] values) {

		Coffe ref = new Coffe();
		ref. addBrandName("bru");
		ref.addBrandName("kothas");    
		ref. addBrandName("instant bru");
		ref. addBrandName("red label");
		ref. addBrandName("green label");
		ref. addBrandName("green label");
		ref. addBrandName("bru");
		
		//System.out.println("------------------");
		
	   /* String[] refName=ref.brandName();
	    
	    for (int i = 0; i < refName.length; i++) 
	    {
			System.out.println(refName[i]);
		}
	    
	    
		System.out.println("------------------");*/

		ref.delete(4);
		ref.delete(2);
		System.out.println("------------------");

		ref.update(2, "malgudi coffe");
	}

}

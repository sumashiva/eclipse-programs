class ProductRunner
{


public static void main(String[] masalaTea)
{
	
	Product product1=new 
	Product("Hair Dryer","EC",1800,2,"Philips");
	product1.displayDetails();
	product1.printTotalCost();
	
	
	Product product2=new 
	Product("Trimmer","EC",200,4,"Nova");
	product2.printTotalCost();
	
	
	
	Product.printTotalProductsPrice();
	
	
}



}
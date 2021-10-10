class FoodItem{
  String name="briyani";
  float price=100;
 String hotelName="tajHotel";
 int quantity=2;
 float rating=5;
 
 
 FoodItem(String name,float price,String hotelname,int quantity,float rating)
 {
	 this.name=name;
	 this.price=price;
	this.hotelName=hotelName;
	 this.quantity=quantity;
	 this.rating=rating;
	 System.out.println("invoking 5 parametersised const");
 }
void displaydetails()
{
System.out.println(this.name);
System.out.println(this.price);
System.out.println(this.hotelName);
System.out.println(this.quantity);
}
 void totalPrice()
{
	
	float price=this.price*this.quantity;
	System.out.println(price);
}
 
 public static void main(String[] args)
 {
	 FoodItem item=new FoodItem("biriyani",100,"sagar",2,4);
	 item.totalPrice();
 }
 
}
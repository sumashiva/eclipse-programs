class CurtainStarter
{
public static void main(String []values)
{
Curtain curtain=new Curtain();

String name=curtain.getName();
System.out.println("curtain name: "+name);

float price=curtain.getPrice();
System.out.println(price);

String brand=curtain.getBrand();
System.out.println(brand);

int noOfCurtains=curtain.getNoOfCurtains();
System.out.println(noOfCurtains);

String color=curtain.getColor();
System.out.println(color);


}

}
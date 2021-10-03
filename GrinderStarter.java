class GinderStarter
{
public static void main(String[] args)
{

Grinder grinder=new Grinder(100,"grinder company");
System.out.println(grinder.capacity);
System.out.println(grinder.company);
int capacity=grinder.capacity;
String brand=grinder.company;
Moter moter=grinder.moter;
System.out.println(moter.model);
System.out.println(moter.rpm);

}



}
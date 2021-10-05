class IceCreamRun{
public static void main(String[] values){
Icecream cream;
cream=new Icecream(-20,"tender",Color.YELLOW);
System.out.println(cream.temp);
System.out.println(cream.flavour);
System.out.println(cream.color);
System.out.println(cream.brand);
System.out.println(cream.type);
cream.type="cone";
cream.brand=new Brand();
System.out.println(cream.brand);
System.out.println(cream);

String fla=cream.flavour;
System.out.println(fla);

float temp=cream.temp;
Brand brand=cream.brand;
String name=brand.name;
String location=brand.location;
String oname=brand.ownerName;
int since=brand.since;

System.out.println(name);
System.out.println(location);
System.out.println(oname);
System.out.println(since);
cream.brand.name=null;
System.out.println(brand.name);
cream.brand=null;
System.out.println(brand.location);
}
}

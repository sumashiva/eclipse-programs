class TubeLightStarter
{
public static void main(String [] values)
{
 TubeLight light=new TubeLight();
 
 String name=light.getName();
 System.out.println("tube light is"+name);
 light.setWatts(20);
 int wats=light.getWatts();
 System.out.println("tube light watts is"+wats);

}

}
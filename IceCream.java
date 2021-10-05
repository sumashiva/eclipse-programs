class Icecream
{

String flavour="vanilla";
Color color=Color.BLACK;
float temp;
String type;
Brand brand;

Icecream(float temp)
{

this.temp=temp;

}

Icecream(float temp,String flavour,Color color)
{
this(temp);
this.flavour=flavour;
this.color=color;

}

}
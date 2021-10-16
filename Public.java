package com.xworkz.different_method;

public class Public {

	private String name="suma";
	public String anotherName="reddy";
    int age=21;
    private int anotherAge=22;
    
   private Public()
    {
    	
      System.out.println(name);
      System.out.println(anotherName);
      System.out.println(age);
    	System.out.println(anotherAge);
    }
   
   public Public(int anotherAge)
   {
	   this.anotherAge=anotherAge;
	   System.out.println(anotherAge);
   }
    Public(String anotherName,int age)
    {
    this.anotherName=anotherName;
    this.age=age;
     System.out.println(anotherName);
     System.out.println(age);
    }
    
   private void method1()
   {
	   System.out.println(name);
	   System.out.println(anotherAge);
   }
   void method2()
   {
	   System.out.println(anotherName);
   }
   
   public void method3()
   {
	   System.out.println(age);
   }
}

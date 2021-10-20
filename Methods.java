package com.xworkz.different_method;

public class Methods {

		public static void main(String [] args)
		{
			String name="reddy";
			String anotherName="123";
			
			float zeros=Float.parseFloat(anotherName);
			System.out.println(zeros);
			
			int zero=Integer.parseInt(anotherName);
			System.out.println(zero);
			
		
			int code=name.codePointAt(2);
			System.out.println(code);
			
		    int codePoint=	name.codePointBefore(3);
		    System.out.println(codePoint);
		
	        int chaer=name.codePointBefore(5);
	        System.out.println(chaer);
	        
	        int count= name.codePointCount(2, 4);
		    System.out.println(count);
		   
		    boolean check=Boolean.parseBoolean(anotherName);
			System.out.println(check);
			
			boolean contain=name.contains("rd");
		   System.out.println(contain);
		}
	}


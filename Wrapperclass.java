package com.xworkz.different_method;

import java.util.Iterator;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nagappa="sonu";
String nagamma=new String("sadya");

boolean same=nagappa.equals(nagamma);
System.out.println("same:"+same);

String concating=nagappa.concat(nagamma);
System.out.println(concating);

boolean checking=nagappa.endsWith("p");
System.out.println(checking);

int codepointAt=nagamma.codePointAt(2);
System.out.println(codepointAt);

char at=nagamma.charAt(3);
System.out.println(at);

int compare=nagamma.compareTo(nagappa);
System.out.println(compare);

boolean content =nagamma.contentEquals(nagappa);
System.out.println(content);

byte[] byteconversion=nagamma.getBytes();
for (int i = 0; i < byteconversion.length; i++) {
	System.out.println(byteconversion[i]);
}
System.out.println(byteconversion);
	
int index=nagappa.indexOf("n");
System.out.println(index);

String uppercase=nagappa.toUpperCase();
System.out.println(uppercase);

	}
}

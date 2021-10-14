package com.xworkz.hostel;
import com.xworkz.hostel.office.*;
public class Hostel {

	public static void main(String[] args) {
	System.out.println("Main method started");

	Office office=new Office();
	float open=office.getOpenTime();
	System.out.println("Office opening Time :"+open);
	System.out.println("Office closing time :"+office.getCloseTime());
	
	
	
	
	
	
	
	}

}

package com.icicibank.netbank.staff;

import com.icicibank.netbank.common.Address;

public class Manager extends Address {
	
	int managerId;
	String name;
	String email;
	String phoneNumber;
	
	Manager(){
		super("1-99", "HYD", "TS", "India");
	}
	
	public void print(){
		System.out.println("Manager print: "+name+", address: "+country);
		printAddress();
	}
	
	public static void main(String[] arr){
		System.out.println("Manager testing");
		
		Manager m = new Manager();
		
		m.print();
	}
	
}
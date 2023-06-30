package com.icicibank.netbank.staff;

import com.icicibank.netbank.common.Address;

public class Manager {
	
	int managerId;
	String name;
	String email;
	String phoneNumber;
	Address address;
	
	public void print(){
		System.out.println("Manager print: "+name+", address: "+address.country);
		address.printAddress();
	}
	
	public static void main(String[] arr){
		System.out.println("Manager testing");
		
		Address a = new Address("1-99", "HYD", "TS", "India");
	}
	
}
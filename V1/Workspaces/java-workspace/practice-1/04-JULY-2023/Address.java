package com.icicibank.netbank.common;

public class Address {
	public String houseNumber;
	public String city;
	public String state;
	public String country;
	
	public Address(){}
	
	public Address(String houseNumber, String city, String state, String country){
		this.houseNumber=houseNumber;
		this.city=city;
		this.state=state;
		this.country=country;		
	}
	public void printAddress(){
		System.out.printf("%S, %S, %S, %S\n", houseNumber,city,state,country);
	}
	public final void test(){
		System.out.println("test from address");
	}
}
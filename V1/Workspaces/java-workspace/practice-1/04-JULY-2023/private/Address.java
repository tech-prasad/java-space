package com.icicibank.netbank.common;

public class Address {
	String houseNumber;
	String city;
	String state;
	private String country;
	
	public Address(){}
	
	public Address(String houseNumber, String city, String state, String country){
		this.houseNumber=houseNumber;
		this.city=city;
		this.state=state;
		this.country=country;		
	}
	private void printAddress(){
		System.out.printf("%S, %S, %S, %S\n", houseNumber,city,state,country);
	}
}
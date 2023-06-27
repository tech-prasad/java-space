public class Address {
	String houseNumber;
	String city;
	String state;
	String country;
	
	Address(String houseNumber, String city, String state, 	String country){
		this.houseNumber=houseNumber;
		this.city=city;
		this.state=state;
		this.country=country;		
	}
	public void printAddress(){
		System.out.printf("%S, %S, %S, %S\n", houseNumber,city,state,country);
	}
}
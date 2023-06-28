public class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address){
		this.name=name;
		this.age=age;
		this.gender=gender;	
		this.address = address;
	}	
	public void print() {
		System.out.printf("%S, %d, %S, %S\n", name,age,gender,address.country);
		address.printAddress();
	}	
	public static void main(String[] arr){	
		
		Address addressReference = new Address("9-889", "Hydrabad", "Telangana", "India");
	
		Person p = new Person("Anil", 33, "Male", addressReference);
		
		p.print();		
	}
}
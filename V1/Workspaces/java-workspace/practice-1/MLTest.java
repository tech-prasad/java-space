class Anil {
	
	public Anil(){
		car = "Kia";
	
		System.out.println("Anil Constructor Called");
	}
	
	String car;
		
	public void driveCar(){
		System.out.println("Driving car:"+car);
	}
}

class Bharat extends Anil {
	
	String bike;
	
	public void driveBike(){
		System.out.println("Driving bike:"+bike);
	}
}

class Chandu extends Bharat {

	public Chandu() {
		super();
		phone = "Apple";
	}

	String phone;
	
	public void usePhone(){
		System.out.println("Use phone:" +phone);
	}
	
}

public class MLTest{
	
	public static void main(String[] array){
		
		Chandu c = new Chandu();
		
		c.phone = "MI";
		
		c.usePhone();
		
		c.driveBike();
		
		c.driveCar();
	}
	
}

Anil Constructor Called
Use phone:MI
Driving bike:null
Driving car:Kia
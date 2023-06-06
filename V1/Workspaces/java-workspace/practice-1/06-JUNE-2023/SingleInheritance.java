class Anil {
	
	String car;
	
	public Anil(){
		car = "Kia";
	
		System.out.println("Anil Constructor Called");
	}
	
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

public class SingleInheritance {
	
	public static void main(String[] arr){
		
		Anil a = new Bharat();
		
		a.driveCar();
	}
}

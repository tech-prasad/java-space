
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

public class Test {
	
	public static void main(String[] arr){
		
		Bharat b = new Bharat();
		
		b.bike = "Pulser";
		
		b.driveBike();
		
		b.driveCar();
	}
}

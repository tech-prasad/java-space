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

class John extends Anil {
		
	String computer = "DELL";

	public void workOnComputer(){
		System.out.println("Working on Computer: "+ computer);
	}
}

public class HirarchicalInheritance {
	
	public static void main(String[] a) {
		
		Bharat b = new Bharat();
		
		b.driveCar();
		
		b.bike = "Pulser";
		
		b.driveBike();
		
		John j = new John();
		
		j.car = "Maruthi";
		
		j.driveCar();
		
		j.workOnComputer();
		
		b.driveCar();
	}
}



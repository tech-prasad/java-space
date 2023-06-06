interface Car {
	
	int CONSTANT=1;

	void driveCar();
	void driveCarWith6Gears();
}

abstract class KiaCar implements Car {

	public void driveCar(){
		System.out.println("Driving Kia Car");
	}
}

class KiaXCar extends KiaCar {

	public void driveCarWith6Gears(){
		System.out.println("Driving Kia Car with 60KMPH");
	}
}

class KiaYCar extends KiaCar {

	public void driveCarWith6Gears(){
		System.out.println("Driving Kia Car with 100KMPH");
	}
}

public class InterfaceExample {

	public static void main(String[] a){
		
		Car c = new KiaXCar();
		
		c.driveCar();
		
		c.driveCarWith6Gears();
		
		Car cy = new KiaYCar();
		
		cy.driveCar();
		
		cy.driveCarWith6Gears();
		
	}
}

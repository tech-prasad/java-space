package com.operators.instance.of;

interface Car {
	void driveCar();
	void soundHorn();
}
abstract class KiaCar implements Car {
	public void driveCar() {
		System.out.println("Driving Kia Car");
	}
}
class KiaXCar extends KiaCar {
	public void soundHorn() {
		System.out.println("Sound horn Kia X Car");
	}
}
class kiaYCar extends KiaCar {
	public void soundHorn() {
		System.out.println("Sound horn Kia Y Car");
	}
	public void openRoofTop() {
		System.out.println("Open roof of Kia Y Car");
	}
}
public class VehicleSystem {	
	public void useCar(Car c) {
		c.driveCar();
		c.soundHorn();

		if (c instanceof kiaYCar) {
			kiaYCar yCar = (kiaYCar) c;
			yCar.openRoofTop();
		}
	}	
	public static void main(String[] args) {
		VehicleSystem v = new VehicleSystem();

		KiaXCar xCar = new KiaXCar();

		v.useCar(xCar);
		
		kiaYCar yCar = new kiaYCar();

		v.useCar(yCar);	
			
	}

}

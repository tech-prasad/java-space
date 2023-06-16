interface Car {
	public abstract void driveCar();
	public abstract void soundHorn();
}
class KiaCar implements Car {
	public void driveCar() {
		System.out.println("Driving KiaCar");
	}
	public void soundHorn(){
		System.out.println("Making sound from KiaCar");
	}
}
class KiaXCar extends KiaCar {
	public void soundHorn(){
		System.out.println("Making sound from KiaXCar");
	}
}
public class MethodOverRidingSecondExample {
	public static void main(String[] arr){
		Car car = new KiaCar();
		
		car.driveCar();
		
		car.soundHorn();
		
		Car carX = new KiaXCar();
		
		carX.driveCar();
		
		carX.soundHorn();
	}
}
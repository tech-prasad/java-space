interface Car {
	public abstract void driveCar();
	public abstract void soundHorn();
}
abstract class KiaCar implements Car {
	public void driveCar() {
		System.out.println("Driving KiaCar");
	}
}
class KiaXCar extends KiaCar {
	public void soundHorn(){
		System.out.println("Making sound from KiaXCar");
	}
}
public class MethodOverRidingExample {
	public static void main(String[] arr){
		
		Car car = new KiaXCar();
		
		car.driveCar();
		
		car.soundHorn();
	}
}
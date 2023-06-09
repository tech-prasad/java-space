interface Car {
	void driveCar();
	void soundHorn();
}
class KiaXCar implements Car {
	public void driveCar(){
		System.out.println("driving x car");
	}
	public void soundHorn(){
		System.out.println("sound x car horn");
	}
}
class KiaYCar implements Car {
	public void driveCar(){
		System.out.println("driving y car");
	}
	public void soundHorn(){
		usePopSoundDriverAndMakeSound();
	}
	public void usePopSoundDriverAndMakeSound(){
		System.out.println("sound y car horn");
	}
}
public class AbstractionExample{
	public static void main(String[] arr){
		Car xCar = new KiaXCar();
		xCar.driveCar(); 
		xCar.soundHorn();
		
		Car yCar = new KiaYCar();
		yCar.driveCar(); 
		yCar.soundHorn();
		
	}
}
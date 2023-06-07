interface Car {
	public abstract void driveCar();	
}
interface Horn extends Car {
	void soundHorn();
}
class KiaCar implements Car {
	public void driveCar(){
		System.out.println("driveCar called");
	}
}
class KiaXCar extends KiaCar implements Horn {
	public void soundHorn(){
		System.out.println("soundHorn called");
	}
}
public class HybridInheritance {
	public static void main(String[] arr){
		KiaXCar c = new KiaXCar();
		c.soundHorn();
		c.driveCar();			
	}	
}

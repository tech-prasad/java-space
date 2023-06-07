interface Car {
	public abstract void driveCar();	
}
class Horn {
	void soundHorn(){
		System.out.println("Horn sound");
	}
}
class KiaCar extends Horn implements Car {
	public void driveCar(){
		System.out.println("Driving Kia Car");
	}
}
public class MultipleInheritance {
	public static void main(String[] arr){
		KiaCar c = new KiaCar();
		
		c.soundHorn();
		c.driveCar();					
	}	
}
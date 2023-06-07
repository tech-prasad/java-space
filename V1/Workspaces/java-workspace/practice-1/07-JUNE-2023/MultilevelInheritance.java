interface Horn {
	void soundHorn();
}
interface Car extends Horn {
	public abstract void driveCar();	
}
class KiaCar implements Car {
	public void soundHorn(){
		System.out.println("soundHorn called");
	}
	public void driveCar(){
		System.out.println("driveCar called");
	}
}
public class MultilevelInheritance {
	public static void main(String[] arr){
		KiaCar c = new KiaCar();
		
		c.soundHorn();
		c.driveCar();
	}	
}
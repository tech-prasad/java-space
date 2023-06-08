interface Car {
}
class KiaCar implements Car {
	public void driveCar(){
		System.out.println("Driving Kia Car");
	}
}
public class KiaCarTest {
	public static void main(String[] arr){
		KiaCar c = new KiaCar();
		c.driveCar();
	}
}
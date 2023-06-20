
public class Calculator extends Object {
	public void add(){
		System.out.println(2+5);
		
		int hashCode1 = super.hashCode();
		
		System.out.println("Hashcode1: "+hashCode1);
		
		int hashCode2 = hashCode();
		
		System.out.println("Hashcode2: "+hashCode2);
	}
	public static void main(String[] arr){
		Calculator c = new Calculator();
		c.add();
	}
}
class Parent {
	int number1 = 3;
	public void print(){
		System.out.println("Print from Parent: "+ number1);
	}
}
class Child extends Parent {
	public Child(){
		super();
		number1 = 8;
	}
	int number1 = 0;
	public void print1(){
		super.print();
		System.out.println("Print from Child with parent Value: "+ super.number1);
		System.out.println("Print from Child: "+ (number1+2));
	}
}
public class NumberProcessor{
	public static void main(String[] array){
		Child ref = new Child();
		ref.print();
	}
}
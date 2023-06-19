class Parent {
	int number1;
	int number2;
	double number3;
	
	public Parent(){
	}
	public Parent(int a){
		number1 = a;
	}
	public Parent(int a, int b){
		number1 = a;
		number2 = b;
	}
	public Parent(int a, double b){
		number1 = a;
		number3 = b;
	}
	public Parent(int a, int b, double c){
		number1 = a;
		number2 = b;
		number3 = c;
	}
	public void print(){
		System.out.println("Print number1 from Parent: "+ number1);
		System.out.println("Print number2 from Parent: "+ number2);
		System.out.println("Print number3 from Parent: "+ number3);
	}
}
class Child extends Parent {
	int number1;
	
	public Child(){
		super();
		number1 = 99;
	}
	public Child(int a){
		super();
		number1 = 77;
	}
	public Child(int a, double c){
		super(a, c);
		number1 = 77;
	}	
	public void print(){
		super.print();
		System.out.println("Print from Child with parent Value: "+ super.number1);
		System.out.println("Print from Child: "+ (number1+2));
	}
}
public class NumberProcessor{
	public static void main(String[] array){
		Child ref = new Child();
		ref.print();
		
		Child ref1 = new Child(565);
		ref1.print();
		
		Child ref2 = new Child(12, 56.45);
		ref2.print();
	}
}
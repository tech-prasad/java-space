class Parent {
	int number1;
	int number2;
	
	public Parent(){
		this(1, 2);
		System.out.println("From zero parameterized constructor");
	}
	public Parent(int a){
		this();
		number1 = a;
	}
	public Parent(int a, int b){
		number1 = a;
		number2 = b;
	}
	public void print(){		
		System.out.println("Print number1 from Parent: "+ number1);
		System.out.println("Print number2 from Parent: "+ number2);
	}
}
class Child extends Parent {
	int number1;
	
	public Child(){
		super(33);
		number1 = 77;
	}
	public Child(int a){
		number1 = a;
	}
	public Child(int a, int c){
		this(a);
		number1 = a;
	}	
	public void print(){
		super.print();
		System.out.println("Print from Child with parent Value: "+ super.number1);
		System.out.println("Print from Child: "+ (number1+2));
	}
}
public class NumberProcessor2{
	public static void main(String[] array){
		Child ref = new Child(565, 4);
		ref.print();
		
	}
}
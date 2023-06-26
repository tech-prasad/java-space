public class Calculator {
	
	int a;
	int b;
	
	public Calculator(int number1, int number2){
		a = number1;
		b = number2;
	}	
	public void add(){
		int c = a + b;
		System.out.println(c);
	}	
	public static void main(String[] arr){
		Calculator c1 = new Calculator(10, 20);
		c1.add();
		
		Calculator c2 = new Calculator(40, 50);
		c2.add();
		
		c1.add();
	}
}
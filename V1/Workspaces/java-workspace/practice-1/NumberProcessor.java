public class NumberProcessor {
	
	public int data;
			
	public void addAndPrint(){
		
		int addedValue = data + 2;
		
		System.out.println(addedValue);
	}
	
	
	public static void main(String[] array){
		
		NumberProcessor object1 = new NumberProcessor();
	
		object1.data = 3;
				
		object1.addAndPrint();
		
		NumberProcessor object2 = new NumberProcessor();
		
		object2.addAndPrint();
		
		NumberProcessor object3 = new NumberProcessor();
		
		object3.data = 78;
		
		object3.addAndPrint();
		
	}
	
}
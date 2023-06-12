public class NumberProcessor {
	
	public void addAndPrint(int data){
		
		int addedValue = data + 2;

		System.out.println(addedValue);
	}
	
	public void addAndPrint(int data, int data2){
		
		int addedValue = data + 78;

		System.out.println(addedValue);
	}
	
	public static void main(String[] array){
		
		NumberProcessor ref = new NumberProcessor();
				
		ref.addAndPrint(44);
	}
}
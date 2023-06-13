public class NumberProcessor {
	public void addAndPrint(int data){
		int addedValue = data + 2;

		System.out.println(addedValue);
	}
	public void addAndPrint(int x, int y){
		int addedValue = x + y + 78;

		System.out.println(addedValue);
	}
	public void addAndPrint(int data, double y){
		double addedValue = data + y + 78;

		System.out.println(addedValue);
	}
	public static void main(String[] array){
		NumberProcessor ref = new NumberProcessor();
		ref.addAndPrint(44);
		ref.addAndPrint(44, 66);
		ref.addAndPrint(44, 66.8);
	}
}




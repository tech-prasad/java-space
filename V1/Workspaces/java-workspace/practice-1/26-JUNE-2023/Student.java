public class Student {
	int rollNumber;
	String studentName;
	static String collegeName = "CBIT";	
	int marks;	
	public Student(int a, String b, int d){
		rollNumber = a;
		studentName = b;
		marks = d;
	}
	public void print() {
		System.out.printf("rollNumber: %d, studentName: %s, collegeName: %s, marks: %d\n", rollNumber, studentName, collegeName, marks);
	}
	public static void main(String[] arr){
		Student s1 = new Student(1, "Anil", 455);
		s1.print();
		
		Student s2 = new Student(2, "Bharat", 467);
		s2.print();
		
		Student s3 = new Student(3, "Chandhu", 455);
		s3.print();
	}
}
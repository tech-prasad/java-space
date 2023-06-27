public class Student {
	int rollNumber;
	String studentName;
	int marks;	
	static String collegeName;
	
	public Student(){}
	public Student(int rollNumber, String studentName, int marks){
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	public void print() {
		System.out.printf("rollNumber: %d, studentName: %s, marks: %d, collegeName: %s\n", rollNumber, studentName, marks, collegeName);
	}
	public static void printCollegeName(){
		System.out.printf("collegeName: %s\n", collegeName);
	}
	public static void main(String[] arr){		
		Student.collegeName = "CBIT";
		
		Student.printCollegeName();

		Student s1 = new Student();
		s1.rollNumber = 2;
		s1.studentName = "Bharat";
		s1.marks = 678;	
		
		s1.print();		

		Student s2 = new Student(3, "Chandu", 555);
		s2.print();
	}
}

public class StudentManagementSystem {
	public static void main(String[] arr){
		
		Address collegeAddress = new Address("1-77", "HYD", "TS", "India");
		College college = new College("CBIT", "BTECH", collegeAddress);
		
		Address libraryAddress = new Address("1-78", "HYD", "TS", "India");
		Library library = new Library("Abcus", libraryAddress);
		
		Address studentAddress = new Address("5-456", "Mumbai", "MH", "India");
		Student student = new Student(123, "Anil", 23, studentAddress, college, library);
		
		student.print();
	}	
}
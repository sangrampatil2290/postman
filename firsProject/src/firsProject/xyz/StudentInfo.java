package firsProject.xyz;

public class StudentInfo {

	int rollNumber = 5;
    String name = "ABC";
	int MarksOfMaths = 35;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student1 = new StudentInfo();
		StudentInfo student2 = new StudentInfo();
		student1.rollNumber = 1;
		student1.name= "Amol";
		student1.MarksOfMaths= 77;
		
		student2.rollNumber = 2;
		student2.name= "Sachin";
		student2.MarksOfMaths= 67;
		
	student1.displayStudentInformation();
	student2.displayStudentInformation();
	}

	public void displayStudentInformation()
	{
		System.out.println("student roll no is=" +rollNumber );
		System.out.println("student name is="+ name);
		System.out.println("student Maths mark is =" + MarksOfMaths );
	}
}

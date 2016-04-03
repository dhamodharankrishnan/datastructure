package day3.examples;

public class ExampleStudent {
	
	int studentRollNo;
    String studentName;
    String department;
    int age;
    
    
    protected ExampleStudent getStudentDetails(int studentRollno, String studentName, String department, int age){
    	ExampleStudent s1 = new ExampleStudent();
    	s1.studentRollNo = studentRollno;
    	s1.studentName = studentName;
    	s1.age = age;
    	s1.department = department;
    	
    	return s1;
    	
    }

}

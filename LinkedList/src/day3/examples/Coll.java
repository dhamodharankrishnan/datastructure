package day3.examples;

public class Coll extends ExampleStudent{
 
	String collName = "Anna Univ";
	
	public void printDetails(){
		
		
		ExampleStudent s = getStudentDetails(10, "Kumar", "ECE", 19);
		
		System.out.println(s.age);
		
	}
 
}

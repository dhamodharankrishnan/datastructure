package interfaces;

public class Student implements IStudent {

	int marks;
	
	public Student(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int aMarks) {
		this.marks = aMarks;

	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}

}

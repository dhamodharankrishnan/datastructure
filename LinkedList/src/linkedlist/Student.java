package linkedlist;

public class Student implements Comparable<Student>{

	String name;
	int mark;
	
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	
	public int compareTo(Student thatStudent) {
		if(this.mark < thatStudent.mark){
			return 1;
		}else if(this.mark > thatStudent.mark){
			return -1;
		}
		return 0;
	}

	
}

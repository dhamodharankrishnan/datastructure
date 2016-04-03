package interfaces;

import java.util.List;

public class ClassRoom implements IClassRoom {

	List<IStudent> studentsList;
	
	public List<IStudent> getStudents() {
		return studentsList;
	}

	public void setStudents(List<IStudent> aStudentList) {
		studentsList = aStudentList;

	}

	@Override
	public String toString() {
		return "ClassRoom [studentsList=" + studentsList + "]";
	}

}

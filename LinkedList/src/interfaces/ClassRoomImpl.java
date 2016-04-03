package interfaces;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomImpl {

	public static void main(String args[]){
		IClassRoom ugClassRoom = new UGClassRoom("UG");
		List<IStudent> ugStudents = new ArrayList<IStudent>();
		ugStudents.add(new Student(10));
		ugStudents.add(new Student(20));
		
		ugClassRoom.setStudents(ugStudents);
		
		IClassRoom pgClassRoom = new PGClassRoom("PG");
		List<IStudent> pgStudents = new ArrayList<IStudent>();
		pgStudents.add(new Student(30));
		pgStudents.add(new Student(40));
		
		pgClassRoom.setStudents(pgStudents);
		
		System.out.println(ugClassRoom);
		System.out.println(pgClassRoom);
	}
}

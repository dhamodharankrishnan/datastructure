package springapp.repository;

import java.util.List;

import springapp.domain.Student;

public interface StudentDao {

	public List<Student> getStudentList();

	public void saveStudent(Student student);

}

package springapp.service;

import java.util.List;

import springapp.domain.Student;
import springapp.repository.StudentDao;

public class StudentManagerService implements StudentManager {

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> getStudentList() {
		return studentDao.getStudentList();
	}

}

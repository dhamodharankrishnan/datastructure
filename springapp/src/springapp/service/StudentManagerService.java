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

	public void saveStudentInfo(StudentInfo studentInfo) {
		Student student = new Student();
		student.setRollNumber(studentInfo.getRollNumber());
		student.setName(studentInfo.getStudentName());
		student.setAge(studentInfo.getAge());
		//TODO: To check if single char is supplied. F-Female, M-Male.
		student.setSex(studentInfo.getSex().charAt(0));
		student.setGrade(studentInfo.getGrade());
		student.setCountry(studentInfo.getCountry());
		
		studentDao.saveStudent(student);
		
	}

}

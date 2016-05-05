package springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springapp.domain.Student;
import springapp.repository.StudentDao;
import springapp.web.StudentInfo;

@Service("studentManager")
public class StudentManagerService implements StudentManager {

	@Autowired
	private StudentDao studentDao;
	
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

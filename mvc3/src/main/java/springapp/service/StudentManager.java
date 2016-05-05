/**
 * 
 */
package springapp.service;

import java.util.List;

import springapp.domain.Student;
import springapp.web.StudentInfo;

/**
 * @author dhamo
 *
 */
public interface StudentManager {
	
	public List<Student> getStudentList();
	
	public void saveStudentInfo(StudentInfo studInfo);

}

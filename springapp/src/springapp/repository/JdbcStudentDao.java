package springapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import springapp.domain.Student;

public class JdbcStudentDao extends SimpleJdbcDaoSupport implements StudentDao {

	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

	/**
	 * @author dhamo
	 *
	 */
	private static class StudentMapper implements
			ParameterizedRowMapper<Student> {

		/* (non-Javadoc)
		 * @see org.springframework.jdbc.core.simple.ParameterizedRowMapper#mapRow(java.sql.ResultSet, int)
		 */
		public Student mapRow(ResultSet resultSet, int arg1) throws SQLException {
			
			Student student = new Student();
			student.setRollNumber(resultSet.getInt("ROLLNUM"));
			student.setName(resultSet.getString("NAME"));
			student.setAge(resultSet.getInt("AGE"));
			student.setSex(resultSet.getString("SEX").charAt(0));
			student.setGrade(resultSet.getString("GRADE"));
			student.setCountry(resultSet.getString("COUNTRY"));
			return student;
		}

	}
		
    public List<Student> getStudentList() {
		logger.info("Getting Students");

		List<Student> studentList = getSimpleJdbcTemplate().query(
				"SELECT ROLLNUM, NAME, AGE, SEX,GRADE,COUNTRY FROM STUDENT_INFO",
				new StudentMapper());
		return studentList;
	}

	public void saveStudent(Student student) {
		
		logger.info("Saving Student:"+student.getName());
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("rollNumber", student.getRollNumber());
		mapSqlParameterSource.addValue("studName", student.getName());
		mapSqlParameterSource.addValue("age", student.getAge());
		mapSqlParameterSource.addValue("sex", student.getSex());
		mapSqlParameterSource.addValue("grade", student.getGrade());
		mapSqlParameterSource.addValue("country", student.getCountry());

		int updCount = getSimpleJdbcTemplate().update("INSERT INTO STUDENT_INFO VALUES(:rollNumber, :studName, :age, :sex, :grade, :country)",mapSqlParameterSource);

		logger.info("Rows affected :"+updCount);
	}

}

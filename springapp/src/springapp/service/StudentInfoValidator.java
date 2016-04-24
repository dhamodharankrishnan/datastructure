package springapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentInfoValidator implements Validator {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
	
	public boolean supports(Class argClass) {
		return StudentInfo.class.equals(argClass);
	}

	public void validate(Object formObj, Errors errors) {

		StudentInfo studInfo = (StudentInfo)formObj;
		
		logger.info("RollNo:"+studInfo.getRollNumber());
		logger.info("Name:"+studInfo.getStudentName());
		logger.info("Age:"+studInfo.getAge());
		logger.info("Sex:"+studInfo.getSex());
	}

}

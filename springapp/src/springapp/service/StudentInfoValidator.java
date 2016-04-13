package springapp.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentInfoValidator implements Validator {

	public boolean supports(Class argClass) {
		return StudentInfo.class.equals(argClass);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}

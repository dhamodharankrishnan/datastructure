package springapp.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.SimpleFormController;

import springapp.service.StudentManager;

public class StudentInfoFormController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private StudentManager studentManager;

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
    
}
